package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mx.com.aaron.algorithms.GreaterSum;

public class GreaterSumTest {
	int[] elements;
	GreaterSum sum;
	
	@Before
	public void setUp() {
		//elements = new int[]{5,4,-5,1,-3,20};
		elements = new int[]{-1,4,5};
		sum = new GreaterSum(elements);
	}

	@Test
	public void test() {
		System.out.println("Greater sum is: " + sum.calculate());
	}

}
