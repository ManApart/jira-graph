import com.github.doyaaaaaken.kotlincsv.dsl.csvReader

fun parseCards(filePath: String): List<Card> {
    val cards = mutableListOf<Card>()

    csvReader().open(filePath) {
        readAllAsSequence().forEach { row: List<String> ->
            println(row)
            cards.add(Card(row[0], row.subList(1, row.size).filter { it.isNotBlank() }))
        }
    }

    cards.forEach { it.setBlocked(cards) }

    return cards
}