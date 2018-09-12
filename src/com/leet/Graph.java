package com.leet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	static Queue<GraphNode> q = new LinkedList<>();

	public static void main(String args[]) {

		GraphNode node40 = new GraphNode(40);
		GraphNode node10 = new GraphNode(10);
		GraphNode node20 = new GraphNode(20);
		GraphNode node30 = new GraphNode(30);
		GraphNode node50 = new GraphNode(50);
		GraphNode node60 = new GraphNode(60);
		GraphNode node70 = new GraphNode(70);

		node40.addNeighbour(node10);
		node40.addNeighbour(node20);
		node10.addNeighbour(node30);
		node20.addNeighbour(node10);
		node20.addNeighbour(node30);
		node20.addNeighbour(node60);
		node20.addNeighbour(node50);
		node30.addNeighbour(node60);
		node60.addNeighbour(node70);
		node50.addNeighbour(node70);

		traverseBfs(node40);
		System.out.println("");
		traverseDfs(node40);

	}

	public static void traverseDfs(GraphNode node) {

		Stack<GraphNode> stack = new Stack<>();

		node.isVisited = true;
		stack.push(node);

		while (!stack.isEmpty()) {

			GraphNode curr = stack.pop();

			System.out.print("#" + curr.data);

			for (int i = 0; i < curr.neighbours.size(); i++) {

				GraphNode neighbour = curr.neighbours.get(i);

				if (!neighbour.isVisited) {

					neighbour.isVisited = true;
					stack.push(neighbour);
				}
			}
		}
	}

	public static void traverseBfs(GraphNode node) {

		if (node == null)
			return;

		node.isVisited = true;
		q.offer(node);

		while (!q.isEmpty()) {

			GraphNode currNode = q.poll();
			System.out.print("#" + currNode.data);

			for (int i = 0; i < currNode.neighbours.size(); i++) {

				GraphNode neighbour = currNode.neighbours.get(i);
				if (!neighbour.isVisited) {
					neighbour.isVisited = true;
					q.offer(neighbour);
				}
			}
		}
	}
}
