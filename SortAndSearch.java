import java.util.ArrayList
public class SortAndSearch {

	public static void main(String[] args) {
int[] ageArray = new int[10];
ArrayList<Integer> ageArrayList = new ArrayList<Integer>(); 

int randomNumber;

        /////////////////////   PART A   /////////////////////
// Insert random numbers between 1 - 20 inside an array of integers
int[] ageArray = { 1, 4, 20, 16, 11, 3, 6, 10, 8, 14 }
for (int i = 0; i < 10; i++) {
randomNumber = (int)(Math.random() * 20) + 1;


}
System.out.println("INSERTION SORT");
        InsertionSort.insertionSort (ageArray);
        // Look for age 7 inside the sorted array
if (foundSeven(ageArray)) { System.out.println("Found seven");
}
else
System.out.println();
///////////////////// PART B /////////////////////
// Insert random numbers between 1 - 20 inside an array of integers
for (int i = 0; i < 10; i++) {

	ageArray[i] = randomNumber;
}
System.out.println("BUBBLE SORT"); BubbleSort.bubbleSort (ageArray);

	System.out.println("Seven not found");

if (arr[i] == 12)
System.out.println("Found twelve"); }
else
            System.out.println("Twelve not found");
        System.out.println();
} }
} }
///////////////////// PART C /////////////////////
// Insert random numbers between 1 - 20 inside an ArrayList
for (int i = 0; i < 10; i++) {
randomNumber = (int)(Math.random() * 20) + 1; ageArrayList.add(randomNumber);
}
System.out.println("QUICK SORT");
System.out.println("Unsorted list: " + ageArrayList); System.out.println("Sorted list: " + QuickSort.quickSort(ageArrayList));
// Loop through the ArrayList of ages and throw an exception if the age is not a teenager
for (int i = 0; i < 10; i++) {
int num = (int)ageArrayList.get(i);
try {
/* #7: Call checkTeenager using num as the parameter */
	
}
catch (Exception e) {
System.out.println(e); }
public static boolean foundSeven(int[] arr) { for (int i = 0; i < 10; i++) {
if (arr[i] == 7) return true;
}else{
	return false;
}
}
public static boolean foundTwelve(int[] arr) { for (int i = 0; i < 10; i++) {
	if (arr[i] == 12)
return true; return false;
public static void checkTeenager(int age)throws InvalidAgeException {
	if (randomNumber <= 13; >= 19)
		return true;
	
	throw new InvalidAgeException("The person who is " + age + " years old is not a
teenager.");
   }
}


	}

}
/* 
INSERTION SORT
Incoming array: [4 9, 7, 3, 7, 16, 4, 11, 18, 6]
Array now: [3, 4, 5, 6, 7, 7, 9, 11, 16, 18]
Found seven

BUBBLE SORT
Incoming array: [ 7, 4, 13, 3, 12, 5, 6, 9, 10, 3 ] 
Finished sorting
Results: [ 3, 3, 4, 5, 6, 7, 9, 10, 12, 13]
Twelve found

QUICK SORT
Unsorted list: [ 4, 6, 15, 2, 6, 7, 8, 3, 3, 10]
Sorted list: [2, 3, 3, 4, 6, 6, 7, 8, 10, 15]
InvalidAgeException: The person who is 2 years old is not a teenager.
InvalidAgeException: The person who is 3 years old is not a teenager.
InvalidAgeException: The person who is 3 years old is not a teenager.
InvalidAgeException: The person who is 4 years old is not a teenager.
InvalidAgeException: The person who is 6 years old is not a teenager.
InvalidAgeException: The person who is 6 years old is not a teenager.
InvalidAgeException: The person who is 7 years old is not a teenager.
InvalidAgeException: The person who is 8 years old is not a teenager.
InvalidAgeException: The person who is 10 years old is not a teenager.

INSERTION SORT
Incoming array: [2 9, 2, 3, 5, 15, 4, 11, 13, 5]
Array now: [2, 2, 3, 4, 5, 5, 9, 11, 13, 15]
Found seven

BUBBLE SORT
Incoming array: [ 7, 4, 11, 3, 14, 5, 6, 9, 10, 5 ] 
Finished sorting
Results: [ 3, 4, 5, 5, 6, 7, 9, 10, 11, 14]
Twelve not found
*/
