package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupShifted {

	public static void main(String[] args) {

	}

	public static List<List<String>> groupStrings(String[] strings) {

		Map<String, List<String>> map = new HashMap<>();
		List<List<String>> list = new ArrayList<>();
		
		int offset = -1;
		for(String s : strings) {
			
			StringBuilder b = new StringBuilder();
			char[] arr = s.toCharArray();
			offset = arr[0] - 'a';
			
			for(char c : arr) {
				char charWithOffset = (char) (c - offset);
				
				if(charWithOffset < 'a') {
					charWithOffset += 26;
				}
				b.append(charWithOffset);
			}
			
			if(map.containsKey(b.toString())) {
				map.get(b.toString()).add(s);
			} else {
				List<String> sList = new ArrayList<>();
				sList.add(s);
				map.put(b.toString(), sList);
			}
		}
		
		Iterator<Entry<String, List<String>>> entryItr = map.entrySet().iterator();
		while(entryItr.hasNext()) {
			
			Entry<String, List<String>> entry = entryItr.next();
			list.add(entry.getValue());
		}		
		return list;
	}
}
