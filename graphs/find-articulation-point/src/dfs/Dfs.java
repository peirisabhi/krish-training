package dfs;

import graph.Graph;

import java.util.*;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/04/2022
 * Time: 10:43 am
 */
public class Dfs<T> {
    private final Stack<T> stack = new Stack<>();

    private final List<T> dfs = new ArrayList<>();
    private final List<T> articulationPoints = new ArrayList<>();
    private final Map<T, Integer> depthIndexes = new HashMap();
    private final Map<T, Integer> lowsEdges = new HashMap<>();

    int count = 1;
    int edgeCount;
    private T parentNode;

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
        System.out.println(articulationPoints);
        System.out.println(depthIndexes);
        System.out.println(lowsEdges);

        return dfs;
    }


    void iterate(T node) {


//        if (graph.getMap().get(node) != null) {
//            for (T currentNode : graph.getMap().get(node)) {
//                if (!stack.contains(currentNode) && !dfs.contains(currentNode)) {
//                    stack.push(currentNode);q
//                    dfs.add(currentNode);


        depthIndexes.put(node, count);
        count++;
        System.out.println(node);





        if (graph.getMap().get(node) != null) {
            for (T nextNode : graph.getMap().get(node)) {

                lowsEdges.put(node, count);


                if (nextNode == parentNode || nextNode.equals(parentNode)) {
                    edgeCount++;
                    continue;
                }




                if (!stack.contains(nextNode) && !dfs.contains(nextNode)) {

                    stack.push(nextNode);
                    dfs.add(nextNode);


                    iterate(nextNode);

                    lowsEdges.put(node, Math.min(lowsEdges.get(node), lowsEdges.get(nextNode)));

                    if (depthIndexes.get(node) <= lowsEdges.get(nextNode)) {
                        if (!articulationPoints.contains(node))
                            articulationPoints.add(node);
                    }

                } else {
                    lowsEdges.put(node, Math.min(lowsEdges.get(node), lowsEdges.get(nextNode)));
                }
            }

        }


//                }
//            }


//        while (stack.size() != 0) {
//            node = stack.pop();
//            if (graph.getMap().get(node) != null) {
//                for (T currentNode : graph.getMap().get(node)) {
//                    if (!stack.contains(currentNode) && !dfs.contains(currentNode)) {
//                        stack.push(currentNode);
//                        dfs.add(currentNode);
//                        iterate(currentNode);
//                    }
//                }
//            }
//        }
    }


}
