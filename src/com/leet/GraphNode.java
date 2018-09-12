package com.leet;

import java.util.ArrayList;

public class GraphNode {

	int data;
	ArrayList<GraphNode> neighbours;
	boolean isVisited;

	public GraphNode(int data) {
		this.data = data;
		this.neighbours = new ArrayList<>();
		this.isVisited = false;
	}

	public void addNeighbour(GraphNode node) {
		this.neighbours.add(node);
	}
}
