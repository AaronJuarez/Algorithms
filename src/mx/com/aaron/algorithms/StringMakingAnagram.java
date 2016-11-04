package mx.com.aaron.algorithms;

/*Given two strings,  and , that may or may not be of the same length, 
 * determine the minimum number of character deletions required to make  
 * and  anagrams. Any characters can be deleted from either of the strings.
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 * */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringMakingAnagram {
	
	public static int numberNeeded(String first, String second) {
        int count = 0;
        String[] firstArray = first.split("");
        String[] secondArray = second.split("");
        
        for(int i=0; i<firstArray.length; i++) {
            if(firstArray[i] != null) {
                for(int j=0; j<secondArray.length; j++) {
                    if(secondArray[j] != null && firstArray[i] != null) {
                        if(firstArray[i].equals(secondArray[j])) {
                            firstArray[i] = null;
                            secondArray[j] = null;
                            break;
                        }
                    }
                }
                if(firstArray[i] != null) {
                    count++;
                }
            }
        }
        System.out.println(count);
        
        for(int i=0; i<secondArray.length; i++) {
            if(secondArray[i] != null) {
                count++;
            }
        }
        return count;
    }

}
