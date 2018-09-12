package com.paypal.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(checkTitle("sadasd sadsad ddd terrorist"));
		System.out.println(checkTitle("sadasd sadsad ddd terrorist act"));
	}

	static Set<String> BAD_WORDS = new HashSet<>();
	
	// precomputed set of bad words
	static {
		BAD_WORDS.add("terrorist act");
		BAD_WORDS.add("bomb");
	}
	
	/**
	 * Check title
	 * @param title
	 * @return
	 */
	public static STATUS checkTitle(String title) {
		
		Iterator<String> itr = BAD_WORDS.iterator();
		while(itr.hasNext()) {
			if(title.contains(itr.next())) {
				return STATUS.BAD;
			}
		}
		return STATUS.GOOD;
	}

	static enum STATUS {
		GOOD, BAD;
	}
}
