package mx.com.aaron.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RansomNote {
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note) {
        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();
        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");
        
        for(String s: magazineArray) {
        	if(magazineMap.containsKey(s)) {
        		magazineMap.put(s, magazineMap.get(s)+1);
        	}else {
        		magazineMap.put(s, 0);
        	}
            
        }
        for(String s : noteArray) {
        	if(noteMap.containsKey(s)) {
        		noteMap.put(s, noteMap.get(s)+1);
        	}else {
        		noteMap.put(s, 0);
        	}
        }
    }
    
    public boolean solve() {
        boolean contains = false;
        Iterator<Map.Entry<String,Integer>> iter = noteMap.entrySet().iterator();
        
        
        while(iter.hasNext()) {
        	Map.Entry<String,Integer> pair = (Map.Entry<String,Integer>)iter.next();
            if(magazineMap.containsKey(pair.getKey()) && magazineMap.get(pair.getKey())>0) {
            	magazineMap.put(pair.getKey(), magazineMap.get(pair.getKey())-1);
                contains = true;
                break;
            }
        }
        return contains;
    }

}
