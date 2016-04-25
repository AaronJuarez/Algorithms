package mx.com.aaron.algorithms.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
	
	public String readString(){
		String data = null;
		
		try{
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			data = br.readLine();
		}catch(IOException io){
			io.printStackTrace();
		}
		return data;
	}
	
	public int readInt(){
		int data = 0;
		
		try{
			data = Integer.parseInt(readString());
		}catch(NumberFormatException e){
			System.out.println("Invalid data");
		}
		return data;
	}
}
