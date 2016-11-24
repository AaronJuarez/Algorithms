package mx.com.aaron.algorithms;

import java.util.ArrayList;
import java.util.List;

/*
* Write a function that generates every sequence of throws a single

* player could throw over a three-round game of rock-paper-scissors.

*

* Your output should look something like:

* [["rock", "rock", "rock"],

* ["rock", "rock", "paper"],

* ["rock", "rock", "scissors"],

* ["rock", "paper", "rock"],

...etc...

 */

public class RockPaperScissors {
	private int players;
	private int combinations;
	private String[] elems = { "R", "P", "S" };
	private List<List<String>> res = new ArrayList<>();

	public List<List<String>> calculate() {
		combinations = (int) Math.pow(elems.length, players);

		populateArrays(new ArrayList<String>());

		for (List<String> a : res) {
			for (String b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		return res;

	}

	public void populateArrays(List<String> arr) {

		if(arr.size() == players) {
			res.add(arr);
		}else {
			
			for(int i=0; i<players; i++) {
				List<String> currentArray = new ArrayList<>(arr);
				currentArray.add(elems[i]);
				populateArrays(currentArray);
			}
		}
		
	}


	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public int getCombinations() {
		return combinations;
	}

	public void setCombinations(int combinations) {
		this.combinations = combinations;
	}

}
