package dfs;


import graph.Graph;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 12/04/2022
 * Time: 8:55 am
 */
public class Application {

    public static void main(String[] args) {

        graph.Graph<String> graph = new Graph<>();

        graph.addEdge("A", "B", true);
        graph.addEdge("B", "G", true);
        graph.addEdge("B", "C", true);
        graph.addEdge("G", "I", true);
        graph.addEdge("C", "D", true);
        graph.addEdge("D", "E", true);
        graph.addEdge("E", "F", true);

//        System.out.println(graph.toString());;

        new Dfs<>(graph).getDfs("A");
        new Dfs<>(graph).getDfs("I");
        new Dfs<>(graph).getDfs("F");

    }

}
