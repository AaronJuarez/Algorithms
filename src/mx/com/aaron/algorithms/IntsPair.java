package mx.com.aaron.algorithms;

import java.util.ArrayList;
import java.util.List;

import mx.com.aaron.algorithms.util.InputData;


public class IntsPair {
	
	private int target;
	private int[] elements;
	private List<int[]> numbers = new ArrayList<int[]>();
	private InputData inputData = new InputData();
	
	
	public IntsPair(){
		
		try{
			System.out.println("Type target: ");
			target = inputData.readInt();
			System.out.println("Type length of array");
			int arrayLength = inputData.readInt();
			elements = new int[arrayLength];
			populateArray();
		}catch(NegativeArraySizeException e){
			System.out.println("Negative array size");
			System.exit(0);
		}
	}
	
	public void populateArray(){
		for(int i=1; i<=elements.length; i++){
			elements[i-1] = i;
		}
	}
	
	public void findNumbers(){
		for(int i=0; i < elements.length; i++){
			for(int j=i+1; j<elements.length; j++){
				int res = elements[i]+elements[j];
				if(res==target){
					int[] nums = {elements[i],elements[j]};
					numbers.add(nums);
				}
			}
		}
	}
	
	public void displayElements(){
		for(int[] elem : numbers){
			System.out.println(elem[0] + " + " + elem[1]);
		}
	}

}
