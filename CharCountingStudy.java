package lesson13;

import java.util.LinkedHashSet;
import java.util.Set;

public class CharCountingStudy {
	public static void main(String[] args) {
		Set<FileExaminer> examiners = new LinkedHashSet<>();
		examiners.add(new FileExaminer("raven.txt"));
		examiners.add(new FileExaminer("jabberwocky.txt"));
		
		for (FileExaminer fe : examiners) {
			System.out.println("--------------------");
			fe.display(9);
			System.out.println();
			fe.displayCharCountAlpha();
			fe.displayCharCountNumericDescending();
		}
	}
}
