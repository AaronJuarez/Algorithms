package mx.com.aaron.algorithms.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import mx.com.aaron.algorithms.RansomNote;

public class RansomNoteTest {
	
	
	@Before
	public void setUp() {
		
	}

	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean answer = false;
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        if(n<m) {
            answer = s.solve();
        }
        
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    
	}

}
