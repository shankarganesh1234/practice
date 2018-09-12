package com.leet;

import java.util.Iterator;
import java.util.Stack;

public class Flatten implements Iterator<Integer> {

	Stack<Integer> stack = new Stack<>();
	
    public Flatten(java.util.List<NestedInteger> nestedList) {
    		append(nestedList);
    }

    @Override
    public Integer next() {
    		return stack.pop();
    }

    @Override
    public boolean hasNext() {
    		
    		if(!stack.isEmpty())
    			return true;
    		
        return false;
    }

    public void append(java.util.List<NestedInteger> nestedList) {
    		
    		for(int i=nestedList.size()-1; i>=0; i--) {
    			
    			if(!nestedList.get(i).isInteger()) {
    				append(nestedList.get(i).getList());
    			}
    			if(nestedList.get(i).getInteger() != null)
    			stack.push(nestedList.get(i).getInteger());
    		}
    	
    }
    
	
}
