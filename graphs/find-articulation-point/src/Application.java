import dfs.Dfs;
import graph.Graph;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/04/2022
 * Time: 10:41 am
 */
public class Application {

    public static void main(String[] args) {

        Graph<String> graph = new Graph<>();

        graph.addEdge("A", "D", true);
        graph.addEdge("A", "B", true);
        graph.addEdge("D", "C", true);
        graph.addEdge("C", "B", true);
        graph.addEdge("C", "E", true);
        graph.addEdge("C", "F", true);
        graph.addEdge("E", "F", true);
        graph.addEdge("F", "G", true);
        graph.addEdge("G", "H", true);
        graph.addEdge("G", "I", true);
        graph.addEdge("H", "I", true);

        System.out.println(graph.toString());


        List<String> dfs = new Dfs<String>(graph).getDfs("A");



    }

}
