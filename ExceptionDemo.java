package exception;



	import java.util.Scanner;
	
	public class ExceptionDemo {
		
			
	    public static void main(String[] args) {
	//The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class
	        System.out.println("Please enter 5 string values in the string array.");
	//System.out.println is a Java statement that prints the argument passed, into the System.out which is generally stdout.
	        

	        String[] arr = new String[5]; // Initializing the string array of size 5

	        Scanner sc = new Scanner(System.in); // Scanner object to get the user

	                                                // input

	        for (int i = 0; i < arr.length; i++) { // Getting input from the user

	                                                // Assuming only one word will

	                                                // be entered
	//here it will print the one word and once the word is printed then it will increment to next one
	            System.out.print("String #" + (i + 1) + ": ");
	//here it will pont the scanner to take next element in the array
	            arr[i] = sc.next();

	        }

	        String str;//initializing a string datatype

	        System.out.print("\nEnter the string to search: ");

	        str = sc.next(); // Getting the search string from user

	        String str1 = searchString(arr, str); // calling the method to search

	                                                // string in array

	        if (str1 == null) { // If method returned null, that means string not

	                            // found

	            System.out.println("String not found.");

	        } else { // else string found and result printed accordingly

	            System.out.println("String found.");

	        }

	    }

	    // method to search the string

	    private static String searchString(String[] arr, String str) {
	 //Flow of try catch block.,If an exception occurs in try block then the control of execution
	 //is passed to the catch block from try block. The exception is caught up by the corresponding catch block
	        try {

	            int i;//initializing the int data type

	            for (i = 0; i < arr.length; i++) { // for loop to search the string

	                                                // in array

	                if (arr[i].equals(str)) { // If string found stop the loop

	                    break;

	                }

	            }

	            if (i == arr.length) { // If value of i is equal to array length ,

	                                    // it means, whole array traversed but

	                                    // string not found

	                throw new ValueNotFoundException();// So exception is thrown

	            } else {

	                return str; // if i is less than array length, it means value

	                            // found , so returned the string itself

	            }

	        } catch (ValueNotFoundException e) {

	            return null; // If exception caught then null is returned

	        }

	    }

	}
