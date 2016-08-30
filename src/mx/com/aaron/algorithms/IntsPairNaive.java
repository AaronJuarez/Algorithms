package mx.com.aaron.algorithms;

import java.util.ArrayList;
import java.util.List;

public class IntsPairNaive {
	private final int target;
	private final int[] elements;
	private List<int[]> results = new ArrayList<>();
	
	public IntsPairNaive(int target, int[] elements) {
		this.target = target;
		this.elements = elements;
	}
	
	public void calculate() {
		
		for(int i=0; i<elements.length; i++) {
			int elem = elements[i];
			
			for(int j=i; j<elements.length; j++) {
				int elem2 = elements[j];
				int res = elem + elem2;
				if(res == target && elem != elem2) {
					results.add(new int[]{elem, elem2});
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
