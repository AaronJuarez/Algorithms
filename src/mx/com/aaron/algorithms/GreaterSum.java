package mx.com.aaron.algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GreaterSum {
	private int[] elems;
	private List<Integer> sumTotals = new ArrayList<>();
	
	public GreaterSum(int[] elements) {
		elems = elements;
	}
	
	public int calculate() {
		int greater = 0;
		
		for(int i=0; i<elems.length; i++) {
			int temp = 0;
			
			for(int j=i; j<elems.length; j++) {
				temp = temp + elems[j];
				sumTotals.add(temp);
			}
		}
		
		display();
		
		for(int i=0; i<sumTotals.size(); i++) {
			int num = sumTotals.get(i);
			if(greater < num) {
				greater = num;
			}
		}
		
		return greater;
	}
	
	public void display() {
		for(int n : sumTotals) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
