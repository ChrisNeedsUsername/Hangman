import java.util.HashMap;
import java.util.Scanner;
import java.io.*;


public class Engine {

	public static HashMap<Integer,String> words = new HashMap <Integer, String>();
	
						
		public static String wordselector(){
			
			int x = 0;
			x = randomNumber();
		    int i;
		    String line = new String();
		    
		    try {
		      //read file.txt
		      FileReader wordlist = new FileReader("src/ListeHangman.txt");
		      BufferedReader buffer = new BufferedReader(wordlist);
		    
		      // iterate through the file
		      for (i = 0; i < 500; i++) {
		        // If the line number = 5 retrieve the line 
		        if (i == x) {
		          line = buffer.readLine();
		        }
		        else
		          buffer.readLine();
		      }
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		   
		    //System.out.println(line);
		    return line;
		   
			
		    
		   /* print ganze file 
		    try {
		        File myObj = new File("src/ListeHangman.txt");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          System.out.println(data);
		        }
		        myReader.close();
		      } catch (FileNotFoundException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    */
		}
	
		 
		
		static int randomNumber() {
			
			int randomNum = (int)(Math.random() * 500);
			return randomNum;
			
		}
		
		
}
