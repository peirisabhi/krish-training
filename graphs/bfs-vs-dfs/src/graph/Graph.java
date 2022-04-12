package graph;

import java.util.*;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 11/04/2022
 * Time: 11:59 am
 */
public class Graph<T> {

    private final Map<T, LinkedList<T>> map = new HashMap<>();

    public Map<T, LinkedList<T>> getMap() {
        return map;
    }

    private void addVertex(T val) {
        map.put(val, new LinkedList<>());
    }

    public void addEdge(T source, T value, boolean bidirectional) {
        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(value))
            addVertex(value);

        map.get(source).add(value);
        if (bidirectional)
            map.get(value).add(source);

    }

    public void getVertexCount() {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
    }

    public void getEdgesCount() {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        System.out.println("The graph has "
                + count
                + " edges.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString()).append(": ");
            for (T w : map.get(v)) {
                builder.append(w.toString()).append(" ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }

}
