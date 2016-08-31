package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import mx.com.aaron.algorithms.IntsPair;
import mx.com.aaron.algorithms.IntsPairNaive;

public class IntsPairTest {
	IntsPair intsPair;
	int[] elements;
/*
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
*/
	@Test
	public void naiveTest() {
		System.out.println("naiveTest:");
		IntsPairNaive intsPairNaive = new IntsPairNaive();
		Integer[] elementsNaive = new Integer[]{0,3,2,1,14,7,6,4,12,9,10,5,8,13,11,15};
		
		intsPairNaive.setData(10, elementsNaive);
		intsPairNaive.calculate();
		intsPairNaive.display();
	}
	
	@Test
	public void extraNumbersTest() {
		System.out.println("extraNumbersTest:");
		IntsPairNaive intsPairNaive = new IntsPairNaive();
		Integer[] elementsNaive = new Integer[]{0,3,2,1,14,7,7,6,4,12,9,10,5,8,13,11,15,1,9};
		
		intsPairNaive.setData(10, elementsNaive);
		intsPairNaive.calculate();
		intsPairNaive.display();
	}
}
