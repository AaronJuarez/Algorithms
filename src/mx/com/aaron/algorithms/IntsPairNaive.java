package mx.com.aaron.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntsPairNaive {
	private int target;
	private Integer[] elements;
	private List<int[]> pairs = new ArrayList<>();
	

	/*
	public void calculate() {
		
		for(int i=0; i<elements.length; i++) {
			Integer elem = elements[i];
			
			for(int j=i; j<elements.length; j++) {
				Integer elem2 = elements[j];
				
				if(elem == null) {
					break;
				}
				if(elem2 == null) {
					continue;
				}
				
				Integer res = elem + elem2;
				if(res == target && elem != elem2) {
					pairs.add(new int[]{elem, elem2});
					elements[i] = null;
					elements[j] = null;
					elem = null;
					elem2 = null;
				}
			}
		}
	}
	*/
	
	public void calculate() {
		HashMap<Integer, Integer> results = new HashMap<>();
		
		for(int i=0; i<elements.length; i++) {
			int elem = elements[i];
			
			if(!results.containsKey(elem)) {
				int res = target - elem;
				results.put(res, elem);
			}else {
				int keyValue = results.get(elem);
				pairs.add(new int[] {elem, keyValue});
				results.remove(elem);
			}
			
		}
		
	}
	
	public void setData(int target, Integer[] elements) {
		this.target = target;
		this.elements = elements;
	}
	
	public void display() {
		for(int[] e : pairs) {
			for(int k : e) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
