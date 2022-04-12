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

        graph.addEdge("A", "B", true);
        graph.addEdge("A", "C", true);
        graph.addEdge("B", "D", true);
        graph.addEdge("B", "G", true);
        graph.addEdge("D", "G", true);
        graph.addEdge("C", "E", true);
        graph.addEdge("C", "F", true);
        graph.addEdge("E", "H", true);

//        System.out.println("Graph:\n" + graph.toString());
//        graph.getVertexCount();
//        graph.getEdgesCount();


        graph.getBfs("A");
        graph.getBfs("B");
        graph.getBfs("G");

    }
}
