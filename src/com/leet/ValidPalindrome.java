package com.leet;

import java.util.LinkedList;
import java.util.List;

public class ValidPalindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		
	}
	
    public static boolean isPalindrome(String s) {
        
        List<Character> chars = new LinkedList<>();
        
        int i = 0;
        s = s.toLowerCase();
        while(i < s.length()) {
            
            char c = s.charAt(i);
            if((c >=48 && c <=57) || (c >=65 && c <=90) || (c >=97 && c <=122))
			{
                chars.add(c);
            }
            i++;
        }
        
        i = 0;
        int j = chars.size() -1;
        while(i< chars.size()/2) {
            
            if(chars.get(i) != chars.get(j))
                return false;
            
            i++;
            j--;
            
        }
        return true;
    }

}
