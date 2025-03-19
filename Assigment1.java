import java.util.Scanner;

/**
 * Bryan Thanaya
 * Main method to run the division program.
 * The program takes user input in the format [num1]%[num2], splits the input into doubles,
 * It will checks for valid decimal input such as (abcd%2.5) will results the program for not running
 * but if we input 2%1 the program will be running since it will be split into two parts 2 and 1 
 * and it will be convert into double 2.0 and 1.0 so it will have a decimal form
 * 
 * It will handles division by zero. if the second number is 0 the program will not run
 * 
 */
public class Assigment1 {

	public static void main(String[] args) {
		//Scanner for the user to input
		Scanner scanner = new Scanner(System.in);
		// Instruction for the user to input using the format of [num1]%[num2]
		System.out.println("Division Program");
		System.out.println("Please enter 2 Number with a format of [num1]%[num2](You don`t need the square bracket for the input)");
		
		try {
			//Read the user input from the console
			String input = scanner.nextLine();
			//Split the input into two number (using String.split() method)
			String num[] = input.split("%");
			
            // Convert the data into Double data types from the split strings.

			Double number1 = Double.valueOf(num[0]);
            Double number2 = Double.valueOf(num[1]);
			
            //check if the second number is 0 or not
            if(number2 == 0) {
            	 throw new ArithmeticException("Enter a number besides zero for the second number");
            }
            //perform the division for number 1 and number 2;
    		double answer =number1/number2;
    		
    		//Print the answer
    		System.out.println("The answer for the division is: " + answer);

			}

		//NumberFormatException to handles cases where the input is not a valid decimal number
		catch(NumberFormatException e){
            System.out.println("Input not valid please use decimal numbers!");
			}
		// ArithmeticException to handle cases where the second number is 2
        catch(ArithmeticException e){
            System.out.println("Enter a number besides zero for the second number");
        	}
		//close scanner
        finally{
        	scanner.close();
        }

	}

}
