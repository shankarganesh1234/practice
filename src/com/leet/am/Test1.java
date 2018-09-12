package com.leet.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Queue<GraphNode> q = new LinkedList<>();

	static int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {

		List<List<GraphNode>> routes = new ArrayList<List<GraphNode>>();

		// convert to graph
		createRouteGraph(area, routes);

		// create edges
		createEdges(routes);

		// traverse and count

		GraphNode startNode = routes.get(0).get(0);
		return getMinimumDistance(startNode);
	}

	static int getMinimumDistance(GraphNode node) {

		if (node == null)
			return -1;

		node.isVisited = true;
		q.offer(node);
		
		StringBuilder builder = new StringBuilder();
		
		while (!q.isEmpty()) {

			GraphNode currNode = q.poll();

			if (isAccessible(currNode.data)) {
				
				builder.append(currNode.data);
				
				if(currNode.data == 9) {
					
					// reached target
					return builder.length() - 1;
				}
				
				for (int i = 0; i < currNode.neighbours.size(); i++) {

					GraphNode neighbour = currNode.neighbours.get(i);
					if (!neighbour.isVisited) {
						neighbour.isVisited = true;
						q.offer(neighbour);
					}
				}

			}
		}
		return -1;
	}

	/**
	 * 
	 * @param area
	 * @param routes
	 */
	static void createRouteGraph(List<List<Integer>> area, List<List<GraphNode>> routes) {

		for (int i = 0; i < area.size(); i++) {

			List<Integer> grids = area.get(i);

			// converting into graph
			List<GraphNode> nodes = new LinkedList<>();
			routes.add(nodes);

			for (int j = 0; j < grids.size(); j++) {

				int data = grids.get(j);

				// only considering accessible grids
				if (isAccessible(data)) {

					GraphNode node = new GraphNode(data);
					nodes.add(node);

				} else {
					GraphNode node = new GraphNode(0);
					nodes.add(node);
				}
			}
		}
	}

	/**
	 * 
	 * @param routes
	 */
	static void createEdges(List<List<GraphNode>> routes) {

		for (int i = 0; i < routes.size(); i++) {

			List<GraphNode> grids = routes.get(i);

			for (int j = 0; j < grids.size(); j++) {

				GraphNode node = grids.get(j);

				if (isAccessible(node.data)) {

					// populate neighbours
					addAccessibleNeighbours(routes, node, j, i, NEIGHBOUR_TYPE.TOP);
					addAccessibleNeighbours(routes, node, j, i, NEIGHBOUR_TYPE.BOTTOM);
					addAccessibleNeighbours(routes, node, j, i, NEIGHBOUR_TYPE.LEFT);
					addAccessibleNeighbours(routes, node, j, i, NEIGHBOUR_TYPE.RIGHT);

				}
			}
		}
	}

	/**
	 * Check if node is accessible
	 * 
	 * @param data
	 * @return
	 */
	static boolean isAccessible(int data) {
		return data == 1 || data == 9;
	}

	/**
	 * 
	 * @param routes
	 * @param node
	 * @param listIndex
	 * @param gridIndex
	 * @param type
	 */
	static void addAccessibleNeighbours(List<List<GraphNode>> routes, GraphNode node, int listIndex, int gridIndex,
			NEIGHBOUR_TYPE type) {

		GraphNode neighbourNode;
		try {

			switch (type) {
			case TOP:

				neighbourNode = routes.get(listIndex - 1).get(gridIndex);
				if (isAccessible(neighbourNode.data)) {
					node.neighbours.add(neighbourNode);
				}
				break;

			case BOTTOM:

				neighbourNode = routes.get(listIndex + 1).get(gridIndex);
				if (isAccessible(neighbourNode.data)) {
					node.neighbours.add(neighbourNode);
				}

				break;
			case LEFT:

				neighbourNode = routes.get(listIndex).get(gridIndex - 1);
				if (isAccessible(neighbourNode.data)) {
					node.neighbours.add(neighbourNode);
				}
				break;
			case RIGHT:

				neighbourNode = routes.get(listIndex).get(gridIndex + 1);
				if (isAccessible(neighbourNode.data)) {
					node.neighbours.add(neighbourNode);
				}

				break;
			default:
				break;

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// handling cases where it can go out of bounds
		}
	}

	static enum NEIGHBOUR_TYPE {
		TOP, BOTTOM, LEFT, RIGHT;
	}

	static class GraphNode {
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

}
