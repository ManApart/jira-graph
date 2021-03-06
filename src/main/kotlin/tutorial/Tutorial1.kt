package tutorial
import org.graphstream.graph.Graph
import org.graphstream.graph.implementations.SingleGraph


fun main() {
    System.setProperty("org.graphstream.ui", "swing")

    val graph: Graph = SingleGraph("Tutorial 1")

    graph.addNode("A")
    graph.addNode("B")
    graph.addNode("C")
    graph.addEdge("AB", "A", "B")
    graph.addEdge("BC", "B", "C")
    graph.addEdge("CA", "C", "A")

    for (node in graph) {
        node.setAttribute("ui.label", "   ${node.id}")
    }

    graph.display()
}