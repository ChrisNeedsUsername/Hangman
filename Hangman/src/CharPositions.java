import java.util.Scanner;
import java.util.ArrayList;

public class CharPositions {
	
	static String Str;	
	
	static ArrayList<String> lineWord = new ArrayList<String>();
	
	static boolean game = true;
	static boolean repeat = true;

	static Scanner sc = new Scanner(System.in);
	static Scanner gsc = new Scanner(System.in);
	
	public static void getChar() {
		
		while(game){
		
			char ch;
			int i = 0;
			int j = 0;		
			int f = 5;
				
			Str = Engine.wordselector();		
			Str = Str.toUpperCase();
			
			//System.out.println(Str);
			
			System.out.println("\nÄ = AE, Ö = OE, Ü = UE, ß = ss");
			System.out.println("\nDu hast "+f+" Leben!");
			System.out.println("\nDas gesuchte Wort:");
			
			// in ArrayList lineWord add "_ " for every char in the searched word
			for(int h = 0; h < Str.length(); h++) {
				
				lineWord.add("_");
				
			}
			
			System.out.print("\n");
			System.out.println(format()+"  "+"["+lineWord.size()+" Buchstaben]");
			
			repeat = true;	
			
			while(repeat) {
			
				System.out.print("\nGib deinen Buchstaben ein =  ");
				
				
				ch = sc.next().charAt(0);
				
				ch = Character.toUpperCase(ch);
					
			// find position of char in word
			while(i < Str.length())
			{
				if(Str.charAt(i) ==  ch) {
					
					//System.out.format("\n %c Found at Position %d ", ch, i + 1);
					String b = String.valueOf(ch);
					
					lineWord.set(i, b);
									
					j++;
				}
				i++;
			}
			if(j == 0) {
				System.out.format("\n%c ist nicht im Wort", ch);
				f--;
				
				System.out.print("\n");
				System.out.print("\n"+f+" Leben übrig\n");
			}
			
			j = 0;
			i = 0;
			
			System.out.println("\n"+format());
			
			//Gewonnen
			if(!lineWord.contains("_"))
			{
				repeat = false;
				System.out.println("\nDu hast gewonnen!");
				
				restartGame();
			}
			
			//Verloren
			if(f == 0) {
				
				repeat = false;
				System.out.println("\nDu hast verloren!");
				System.out.println("\nDas gesuchte Wort war: "+Str);
				
				restartGame();
				}
			
			}

		}
	}
	
	
	public static String format() {
		
		String formattedString = lineWord.toString()
			    .replace(",", "")  //remove the commas
			    .replace("[", "")  //remove the right bracket
			    .replace("]", "")  //remove the left bracket
			    .trim();           //remove trailing spaces from partially initialized arrays
		
		return formattedString;
		
	}
	
	public static Boolean restartGame() {
		
		System.out.println("\nNoch ne Runde?");
		System.out.println("\nJ = Ja, N = Nein");
		
		
		char r = gsc.next().charAt(0);
		
		r = Character.toUpperCase(r);
		
		lineWord.clear();
		
		
		if(r == 'N') {
			
			game = false;
			System.out.println("\nTschüss!");
			
		}
		return game;
		
	}
	
	
	
	

}