package com.leet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindAnagramMappings {

	public static void main(String[] args) {

//		int[] A = new int[] {12, 28, 46, 32, 50};
//		int[] B = new int[] {50, 12, 32, 46, 28};
		
		int[] A = new int[] {40,40};
		int[] B = new int[] {40,40};
		System.out.println(anagramMappings(A,B));
	}

	public static int[] anagramMappings(int[] A, int[] B) {

		List<Integer> fList = new LinkedList<>();
		Map<Integer, List<Integer>> m = new HashMap<>(100);

		for (int j = 0; j < B.length; j++) {

			if (m.containsKey(B[j])) {
//				List<Integer> l = m.get(B[j]);
//				l.add(j);
//				m.put(B[j], l);
			} else {
				List<Integer> l = new LinkedList<>();
				l.add(j);
				m.put(B[j], l);
			}
		}
		
		
		for(int i=0; i<A.length; i++) {
			fList.addAll(m.get(A[i]));
		}
		
		int[] fArr = new int[fList.size()];
		
		for(int i=0; i<fList.size(); i++) {
			fArr[i] = fList.get(i);
		}
		return fArr;
	}

}
