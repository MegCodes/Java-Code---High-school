import java.util.Scanner;

public class Hangman{
	public static void main(String[] args) {
        String[] words = {"sticker", "yellow", "christmas"};
        int randomWordNumber = (int) (Math.random() * words.length);
        int MAX_INCORRECT = 5;
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        System.out.println("Welcome to Hangman.");
        boolean wordIsGuessed = false;
        do {
        switch (enterLetter(words[randomWordNumber], enteredLetters)) {
            case 0:
                triesCount++;
                break;
            case 1:
                System.out.println("Correct!");
                break;
            case 2:
                break;
            case 3:
                wordIsGuessed = true;
                break;
            case 4:
            	if (triesCount++ >= MAX_INCORRECT) {
            		System.out.println("Sorry, you lose. "+"The word was: " + words[randomWordNumber]+".");
            	System.exit(0);
            	}
        }
        } while (! wordIsGuessed);
        System.out.println("\nYou found all the letters in the word " + words[randomWordNumber] +"." +
            " You win!");
    }

    public static int enterLetter(String word, char[] enteredLetters)
    {
  
    	int MAX_INCORRECT = 5;
    	int triesCount = 0;

        System.out.println("Here is your word: ");
        if (! printWord(word, enteredLetters))
            return 3;
        System.out.println(" Your guess: ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = findEmptyPosition(enteredLetters);
        char userInput = input.nextLine().charAt(0);
        
        if (inEnteredLetters(userInput, enteredLetters)) {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (word.contains(String.valueOf(userInput))) {
            enteredLetters[emptyPosition] = userInput;
            return 1;
        }
        else {
            System.out.println(userInput + " not found!");
            System.out.println(" You have used " + (triesCount+=1) + " out of "+ MAX_INCORRECT + " missing guesses.");
            return 4;
        }

        		
        	}
    public static boolean printWord(String word, char[] enteredLetters) {
        boolean asteriskPrinted = false;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (inEnteredLetters(letter, enteredLetters))
                System.out.print(letter);
            else {
                System.out.print('-');
                asteriskPrinted = true;
            }
        }
        return asteriskPrinted;
    }
    
    public static boolean inEnteredLetters(char letter, char[] enteredLetters) {
        return new String(enteredLetters).contains(String.valueOf(letter));
    }

    public static int findEmptyPosition(char[] enteredLetters) {
        int i = 0;
        while (enteredLetters[i] != '\u0000') i++;
        return i;
    }
}
/* Sample1
 Welcome to Hangman.
Here is your word: 
------- Your guess:  
s
Correct!
Here is your word: 
s------ Your guess: 
t
Correct!
Here is your word: 
st----- Your guess: 
i
Correct!
sti---- Your guess: 
a
a not found!
 You have used 1 out of 5 missing guesses.
Here is your word: 
sti---- Your guess: 
c
Correct!
Here is your word: 
stic--- Your guess: 
k
Correct!
Here is your word: 
stick-- Your guess: 
e
Correct!
Here is your word: 
sticke- Your guess: 
r
Correct!
Here is your word: 
sticker
You found all the letters in the word sticker. You win!*/

/*Sample2
Welcome to Hangman.
Here is your word: 
------ Your guess: 
y
Correct!
Here is your word: 
y----- Your guess: 
t
t not found!
 You have used 1 out of 5 missing guesses.
Here is your word: 
y----- Your guess: 
a
a not found!
 You have used 2 out of 5 missing guesses.
Here is your word: 
y----- Your guess: 
y
y is already in the word
Here is your word: 
y----- Your guess: 
u
u not found!
 You have used 3 out of 5 missing guesses.
Here is your word: 
y----- Your guess: 
o
Correct!
Here is your word: 
y---o- Your guess: 
t
t not found!
 You have used 4 out of 5 missing guesses.
Here is your word: 
y---o- Your guess: 
w
Correct!
Here is your word: 
y---ow Your guess: 
q
q not found!
 You have used 5 out of 5 missing guesses.
Sorry, you lose. The word was: yellow.

 */
