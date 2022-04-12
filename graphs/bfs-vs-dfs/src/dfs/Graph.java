package dfs;

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

    public void addEdge(T source, T value, boolean bidirectional) {
        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(value))
            addVertex(value);

        map.get(source).add(value);
        if (bidirectional)
            map.get(value).add(source);

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


    void getDFS(T startingNode) {

        Stack<T> queue = new Stack<>();
        List<T> dfs = new ArrayList<>();


    }

}