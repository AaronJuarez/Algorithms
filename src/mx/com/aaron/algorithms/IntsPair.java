package mx.com.aaron.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class IntsPair {
	
	private int target;
	private int[] elems;
	private List<int[]> numbers = new ArrayList<int[]>();
	private HashMap<IntsPair.IntsPairKey, Integer> elements = new HashMap<IntsPair.IntsPairKey,Integer>();
	
	
	public IntsPair(int target, int[] elems) {
		this.elems = elems;
		this.target = target;
		storeValues();
	}
	
	public void storeValues() {
		for(int e : elems) {
			IntsPairKey key = new IntsPairKey(e);
			elements.put(key, e);
		}
	}
	
	
	public void findNumbers(){
		
		Iterator<Entry<IntsPairKey, Integer>> iter = elements.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<IntsPair.IntsPairKey, Integer> currentElement = iter.next();
			Integer keyNum = currentElement.getKey().key;
			
			if(elements.containsValue(keyNum)) {
				int[] nums = {keyNum, currentElement.getValue()};
				numbers.add(nums);
			}
			
		}
		
	}
	
	public class IntsPairKey {
		int key;
		int value;
		
		public IntsPairKey(int value){
			this.value = value;
		}
		
		@Override
		public int hashCode(){
			key = target-value;
			return key;
		}
	}
	
	public List<int[]> getNumbers() {
		return numbers;
	}

}
