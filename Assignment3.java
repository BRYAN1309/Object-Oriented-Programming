import java.util.Scanner;
/**
 * The code is a simple phone book program that allows users to
 * add, search, and delete contact information (name and phone number). 
 * The program is designed to handle up to 1000 contacts 
 * 
 * The contact information is stored in two arrays: one for names and one for phone numbers.
 * 
 * Features:
 * - Add a new contact.
 * - Search for a contact by name and display the corresponding phone number.
 * - Delete a contact by name.
 * - Exit the program.
 * 
 * Example usage:
 * - The user is presented with a menu to select an option: Add, Get, Delete contact, or Exit.
 * 
 * Example Input:
 * Enter your choice:
 * 1. Add Contact
 * 2. Get Contact
 * 3. Delete Contact
 * 4. Exit
 * 
 * Example Output:
 * Contact added successfully!
 * The phone number of John is: 123456789
 * Contact John has been removed successfully!
 * 
 * @author BryanThanaya - 2702334784
 */
public class Assignment3 {

    public static void main(String[] args) {
		//scanner to take the user input
        Scanner scanner = new Scanner(System.in);
        //max contact for the array size
        int MaxContact = 1000;
        // Arrays to store contact names and corresponding phone numbers
        String[] name = new String[MaxContact];
        String[] phone = new String[MaxContact];
        //declaration for user choice and contact count the menu program
        int choice = 0;
        int Contactcount = 0;
        //while loop for the menu
        while (choice != 4) {
        	//display all the menu option
            System.out.println("=====  Java Phone Book program =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Get Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            //scanner for get user choice
            choice = scanner.nextInt();
            scanner.nextLine(); 
            //switch case for the menu program
            switch (choice) {
                case 1:
                	//get the user name and phone number
                    System.out.print("Enter your name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String newPhone = scanner.nextLine();
                    //store the user new name and phone number
                    if (Contactcount < MaxContact) {
                        name[Contactcount] = newName;
                        phone[Contactcount] = newPhone;
                        Contactcount++;//increment the contact count
                        System.out.println("Contact added successfully!");
                    } else {
                        System.out.println("Your contact list is full. Please delete a contact to free memory.");
                    }
                    break;

                case 2:
           
                    System.out.println("Enter the name you want to search:");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    	//iterate to find the matching name
                    for (int i = 0; i < Contactcount; i++) {
                        if (name[i].equalsIgnoreCase(searchName)) { //compare the search name using equalIgnore case to ignore sensitive upper case and lower case
                            System.out.println("The phone number of " + searchName + " is: " + phone[i]);
                            found = true;//print the reslut if true
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("The contact you are searching for is not found.");//print the reslut if false
                    }
                    break;

                case 3:
                    System.out.println("Enter the name you want to delete:");
                    String deleteName = scanner.nextLine();
                    found = false;
                    	//iterate to find the matching delete name
                    for (int i = 0; i < Contactcount; i++) {
                        if (name[i].equalsIgnoreCase(deleteName)) { //compare the delete name using equalIgnore case to ignore sensitive upper case and lower case
                            for (int j = i; j < Contactcount - 1; j++) {
                                name[j] = name[j + 1];
                                phone[j] = phone[j + 1];
                            } // Shift the contacts down by one position after the deleted contact                       
                            name[Contactcount - 1] = null;
                            phone[Contactcount - 1] = null;
                            Contactcount--; //decrease the contact count using decrement
                            System.out.println("Contact " + deleteName + " has been removed successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (found ==false) {
                    	//if the delete name not found
                        System.out.println("The contact you want to delete is not found.");
                    }
                    break;

                case 4:
                	//exit the program
                    System.out.println("Program closed.");
                    break;

                default:
                	// to handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close(); 
    }
}
