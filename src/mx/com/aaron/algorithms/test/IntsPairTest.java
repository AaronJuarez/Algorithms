package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import mx.com.aaron.algorithms.IntsPair;

public class IntsPairTest {
	IntsPair intsPair;
	int[] elements;

	@Test
	public void test() {
		elements = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		intsPair = new IntsPair(10, elements);
		intsPair.findNumbers();
		displayElements();
	}
	
	public void displayElements() {
		for(int[] num : intsPair.getNumbers()){
			System.out.println(num[0] + " + " + num[1]);
		}
	}

}
