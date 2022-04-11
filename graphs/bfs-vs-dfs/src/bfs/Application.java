package bfs;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 11/04/2022
 * Time: 12:12 pm
 */
public class Application {
    public static void main(String args[])
    {
        Graph<String> graph = new Graph<>();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "G");
        graph.addEdge("D", "G");
        graph.addEdge("C", "E");
        graph.addEdge("C", "F");
        graph.addEdge("E", "H");

//        System.out.println("Graph:\n" + graph.toString());
//        graph.getVertexCount();
//        graph.getEdgesCount();


        graph.BFS("A");

    }
}
