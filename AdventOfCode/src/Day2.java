import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] main) throws FileNotFoundException {
        //creating File instance to reference text file in Java
        File text = new File("inputDay2.txt");
     
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNext()){
            String next = scnr.next();
            System.out.println(next);
            lineNumber++;
        }    
		
        /* 
         * Appreciative of your help yesterday, one Elf gives you an 
         * encrypted strategy guide (your puzzle input) that they say 
         * will be sure to help you win. "The first column is what your 
         * opponent is going to play: A for Rock, B for Paper, and C 
         * for Scissors. The second column--" 
         * Suddenly, the Elf is called away to help with someone's tent.
         * 
         * The second column, you reason, must be what you should play in response: 
         * X for Rock, Y for Paper, and Z for Scissors. 
         * Winning every time would be suspicious, so the responses must have 
         * been carefully chosen.
         */
        
        
        
	}

}
