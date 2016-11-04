package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mx.com.aaron.algorithms.StringMakingAnagram;

public class StringMakingAnagramTest {
	String s1;
	String s2;
	
	@Before
	public void setUp() {
		s1 = "cde";
		s2 = "abc";
	}

	@Test
	public void test() {
		int count = StringMakingAnagram.numberNeeded(s1, s2);
		assertEquals(count, 4);
	}

}
