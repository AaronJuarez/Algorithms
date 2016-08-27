package mx.com.aaron.algorithms;

import java.lang.reflect.Array;

public class GreaterSum {
	private int[] elems;
	
	public GreaterSum(int[] elements) {
		elems = elements;
	}
	
	public int calculate() {
		int temp = elems[0];
		
		for(int i=0; i<elems.length-1; i++) {
			
			int elem = elems[i];
			int elemSum = elem + elems[i+1];
			
			 if(elem >= temp) {
				 temp = elem;
			 }
			 if(elemSum >= temp) {
				 temp = elemSum;
			 }
			 System.out.println(temp);
		}
		return temp;
	}

}
