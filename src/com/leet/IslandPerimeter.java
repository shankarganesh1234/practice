package com.leet;

public class IslandPerimeter {

	public static void main(String[] args) {
		//int[][] grid = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int[][] grid = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(islandPerimeter(grid));
	}

	public static int islandPerimeter(int[][] grid) {

		int c = grid[0].length;
		int p = 0;

		try {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < c; j++) {

				if (grid[i][j] == 1) {
					p += (addTop(grid, i, j) + addBottom(grid, i, j) + addLeft(grid, i, j) + addRight(grid, i, j));
				}
			}
		}
		} catch (Exception e) {
			
		}
		return p;
	}

	public static int addTop(int[][] grid, int i, int j) {

		int result = 0;
		try {
			if (grid[i + 1][j] == 0) {
				result++;
			}
		} catch (Exception e) {
			result++;
		}
		return result;
	}

	public static int addBottom(int[][] grid, int i, int j) {

		int result = 0;
		try {
			if (grid[i - 1][j] == 0) {
				result++;
			}
		} catch (Exception e) {
			result++;
		}
		return result;
	}

	public static int addLeft(int[][] grid, int i, int j) {

		int result = 0;
		try {
			if (grid[i][j - 1] == 0) {
				result++;
			}
		} catch (Exception e) {		
			result++;
		}
		return result;
	}

	public static int addRight(int[][] grid, int i, int j) {

		int result = 0;
		try {
			if (grid[i][j + 1] == 0) {
				result++;
			}
		} catch (Exception e) {
			result++;
		}
		return result;
	}

}
