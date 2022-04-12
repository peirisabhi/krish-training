package dfs;

import bfs.Graph;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 12/04/2022
 * Time: 8:55 am
 */
public class Application {

    public static void main(String[] args) {

        bfs.Graph<String> graph = new Graph<>();

        graph.addEdge("A", "B", true);
        graph.addEdge("B", "G", true);
        graph.addEdge("B", "C", true);
        graph.addEdge("G", "I", true);
        graph.addEdge("C", "D", true);
        graph.addEdge("D", "E", true);
        graph.addEdge("E", "F", true);

        System.out.println(graph.toString());;

    }

}
