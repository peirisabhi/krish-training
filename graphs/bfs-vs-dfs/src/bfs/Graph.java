package bfs;

import java.util.*;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 11/04/2022
 * Time: 11:59 am
 */
public class Graph<T> {

    private final Map<T, LinkedList<T>> map = new HashMap<>();

    private void addVertex(T val){
        map.put(val, new LinkedList<>());
    }

    public void addEdge(T source, T value){
        if (!map.containsKey(source))
            addVertex(source);

        map.get(source).add(value);

    }

    public void getVertexCount()
    {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
    }

    public void getEdgesCount()
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        System.out.println("The graph has "
                + count
                + " edges.");
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }


    void getBfs(T startingNode) {

        Queue<T> queue = new LinkedList<>();
        List<T> bfs = new ArrayList<>();

        queue.add(startingNode);
        bfs.add(startingNode);

        T node;

        while (queue.size() != 0) {
            node = queue.poll();

            if(map.get(node) != null) {

                for (T currentNode : map.get(node)) {
                    if (!bfs.contains(currentNode) && !queue.contains(currentNode)) {
                        bfs.add(currentNode);
                        queue.add(currentNode);
                    }
                }
            }
        }

        System.out.println(bfs);
    }

}
