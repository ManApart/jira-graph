import org.graphstream.graph.Graph
import org.graphstream.graph.implementations.SingleGraph

fun main() {
    System.setProperty("org.graphstream.ui", "swing")

    val cards = parseCards(".\\sample.csv")

    val graph: Graph = SingleGraph("Jira Dependencies")

    cards.forEach { card ->
        val node = graph.addNode(card.id)
        node.setAttribute("ui.label", card.id)
    }

    cards.forEach { card ->
        card.blocks.forEach { blocked ->
            graph.addEdge(card.id + blocked.id, card.id, blocked.id)
        }
    }

    graph.display()
}
