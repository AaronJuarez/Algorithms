package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import mx.com.aaron.algorithms.RockPaperScissors;

public class RockPaperScissorsTest {

	@Test
	public void test() {
		RockPaperScissors game = new RockPaperScissors();
		game.setPlayers(3);
		List<List<String>> res = game.calculate();
		
		assertEquals(game.getCombinations(), res.size());
	}

}
