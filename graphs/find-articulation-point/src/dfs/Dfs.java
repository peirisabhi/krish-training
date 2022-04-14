package dfs;

import graph.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/04/2022
 * Time: 10:43 am
 */
public class Dfs<T> {
    private final Stack<T> stack = new Stack<>();

    private final List<T> dfs = new ArrayList<>();

    private final Graph<T> graph;

    public Dfs(Graph<T> graph) {
        this.graph = graph;
    }

    public List<T> getDfs(T startingNode) {

        stack.push(startingNode);
        dfs.add(startingNode);
        iterate(startingNode);
//        System.out.println(stack);
        System.out.println("Starting from vertex " + startingNode + ", then DFS is " + dfs);

        return dfs;
    }


    void iterate(T node) {


        if (graph.getMap().get(node) != null) {
            for (T currentNode : graph.getMap().get(node)) {
                if (!stack.contains(currentNode) && !dfs.contains(currentNode)) {
                    stack.push(currentNode);
                    dfs.add(currentNode);
                    iterate(currentNode);
                }
            }
        }


        while (stack.size() != 0) {
            node = stack.pop();
            if (graph.getMap().get(node) != null) {
                for (T currentNode : graph.getMap().get(node)) {
                    if (!stack.contains(currentNode) && !dfs.contains(currentNode)) {
                        stack.push(currentNode);
                        dfs.add(currentNode);
                        iterate(currentNode);
                    }
                }
            }
        }
    }


}
