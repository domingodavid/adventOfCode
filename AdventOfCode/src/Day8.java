import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day8 {

	public static void main(String[] main) throws FileNotFoundException {
        //creating File instance to reference text file in Java
        File text = new File("inputDay8.txt");
     
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }    
		
	}


}
