import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

	public class HangmanWord {
		private String[] possibleWords={"Writing", "Teacher", "Sticker"};
		private String[] word;
		private char[] Progress;
		private int wrongCount = 0;
		
			
	public HangmanWord(){
		Random rand = new Random();
		int n = rand.nextInt(3);
		word = possibleWords;
		char Progress='n';
		int a = Character.getNumericValue(n);
		System.out.println(Progress);
	}
}

	public static boolean printWord(String word, char[] Progress) {
		boolean dashPrinted = false;
		for (int i=0; i < word.length(); i++) {
			char letter = word.charAt(i);
			System.out.println(  = '-');
		}
	}
					
			
			
		}
	