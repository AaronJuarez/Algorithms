package mx.com.aaron.algorithms;

import java.util.ArrayList;
import java.util.List;

public class IntsPairNaive {
	private final int target;
	private Integer[] elements;
	private List<int[]> results = new ArrayList<>();
	
	public IntsPairNaive(int target, Integer[] elements) {
		this.target = target;
		this.elements = elements;
	}
	
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
					results.add(new int[]{elem, elem2});
					elements[i] = null;
					elements[j] = null;
					elem = null;
					elem2 = null;
				}
			}
		}
	}
	
	public void display() {
		for(int[] e : results) {
			for(int k : e) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
