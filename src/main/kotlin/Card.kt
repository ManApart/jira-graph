class Card(val id: String, private val blockedIds: List<String>) {
    var blocks: List<Card> = listOf()

    fun setBlocked(allCards: List<Card>) {
        blocks = allCards.filter { blockedIds.contains(it.id) }
    }
}