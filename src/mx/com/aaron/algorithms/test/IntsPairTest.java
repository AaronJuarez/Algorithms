package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import mx.com.aaron.algorithms.IntsPair;

public class IntsPairTest {
	IntsPair intsPair;

	@Test
	public void test() {
		intsPair = new IntsPair();
		intsPair.findNumbers();
		intsPair.displayElements();
	}

}
