package com.ry.jdatastruct.graph;

public class Main {
    public static void main(String[] args) {
//
//        var graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "C");
//        graph.addEdge("A", "C");
//        System.out.println(graph.hasCycle());
        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "D", 5);
        graph.addEdge("A", "C", 1);
        graph.addEdge("B", "C", 2);

        var tree = graph.getMinimumSpanningTree();
        System.out.println(tree);

    }
}
