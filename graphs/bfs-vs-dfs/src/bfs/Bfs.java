package bfs;

import graph.Graph;

import java.util.*;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 12/04/2022
 * Time: 9:04 am
 */
public class Bfs<T> {

    public void getBfs(T startingNode, Graph<T> graph) {

        Queue<T> queue = new LinkedList<>();
        List<T> bfs = new ArrayList<>();

        queue.add(startingNode);
        bfs.add(startingNode);

        T node;

        while (queue.size() != 0) {
            node = queue.poll();

            if (graph.getMap().get(node) != null) {

                for (T currentNode : graph.getMap().get(node)) {
                    if (!bfs.contains(currentNode) && !queue.contains(currentNode)) {
                        bfs.add(currentNode);
                        queue.add(currentNode);
                    }
                }
            }
        }

        System.out.println("Starting from vertex " + startingNode + ", then BFS is " + bfs);
    }

}
