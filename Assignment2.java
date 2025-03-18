import java.util.Scanner;
/**
 * The  program allows users to input a series of integer numbers separated by commas. 
 * It parses the input, stores the numbers in an array, displays the original series, 
 * and then sorts using bubble sort method and prints the sorted series.
 *  * 
 * Usage:
 * - The user inputs a series of integers separated by commas.
 * - The program outputs the original series and the sorted series in ascending order.
 * 
 * Example Input:
 * Enter a series of integer number, separated with comma (',').
 * 10, 3, 45, 1, 7
 * 
 * Example Output:
 * Original Series:
 * 10 3 45 1 7 
 * Sorted Series:
 * 1 3 7 10 45
 * 
 * @author BryanThanaya - 2702334784
 */
public class Assignment2 {

	public static void main(String[] args) {
		//scanner to take the user input
		Scanner scanner = new Scanner(System.in);
		//instruction for the input
		System.out.println("Enter a series of integer number, separated with comma (','). ");
		//capture the input as a string
		String input = scanner.nextLine();
		//split the input string by comma and store them in array
		String[] numberArray = input.split(",");
		//make a integer array 
		Integer[] number = new Integer[numberArray.length];
		//parse each element from string array to integer array
		 for(int i = 0; i < numberArray.length; i++) {
	         number[i] = Integer.parseInt(numberArray[i].trim()); 
	     }
	        
		//display the original series
		System.out.println("Original Series:");
		for(int i = 0; i<numberArray.length; i++) {
			System.out.print(number[i] + " ");
		}
		//bubble sort method 
		//references https://youtu.be/86B5U15c88w?si=DLFMP8ynClk-cNiD
		int temp = 0;
		for(int i = 0; i<numberArray.length; i++) {
			for(int j = i+1; j<numberArray.length; j++) {
				if(number[j]<number[i]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		//print the sorted series
		System.out.println("\nSorted Series");
		for(int i = 0; i<numberArray.length; i++) {
			System.out.print(number[i] + " ");
		}
		//close scanner
		scanner.close();
	}

}
