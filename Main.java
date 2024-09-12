//Discussion Forum Unit 1

    // Errors are inevitable in Java, and proper error handling is essential for saving time during debugging. As described by Morelli and Walde (n.d.), proper error handling involves using specific code blocks to protect your program from unexpected errors. These code blocks prevent the program from crashing entirely and help you identify and address issues more efficiently than without error handling. The main 4 blocks used for error handling in Java are called try, catch, throw, and finally. 

   //  Try: If you want to attempt something that is likely to fail, you can use the try block. You wrap your code inside of the try block so that if something unexpected happens the program can handle it without crashing. The try block acts as a safety net, catching potential issues before they can break the program(Morelli & Walde, n.d.).

   //  Catch: Comes after the try block and is used in conjunction with it. You use the catch block to tell the program what to do instead of crashing when an expected error comes up. The catch block is basically giving the program a backup plan for if things go wrong (Morelli & Walde, n.d.).


   //  Finally: This block always runs, regardless of whether an error occurred, and comes after the try and catch blocks. You can use it to close files, network connections, log information, or clean up memory or objects. It ensures that cleanup tasks get done no matter the outcome, like tidying up after attempting something (Morelli & Walde, n.d.).


   //  Throw: The throw block can be placed anywhere in your code to deliberately cause an exception when something happens that shouldn't within your code.  You use throw to signal that there’s a problem (such as invalid input or an out-of-bounds condition) and pass it to another part of the program (typically the catch block) to handle it (Morelli & Walde, n.d.).

 //    Below is some code for converting a cat’s age to human years, demonstrating the use of the above 4 error handling blocks being Try, Catch, Finally, and Throw:

import java.util.Scanner;



public class Main {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);  // Creating a scanner object for user input



       try {

           //This try block handles potential expected invalid input like a

           // negative or non-numerical age for the cat

           System.out.print("Enter the cat's age in years: ");

           int catAge = scanner.nextInt();  // Take user input for the cat's age



           // If age valid, convert it to human age

           checkCatAge(catAge);

       } catch (IllegalArgumentException e) {

           // Handle the exception if the try block fails and input is invalid (e.g., negative age)

           System.out.println("Error: " + e.getMessage());

       } finally {

           // This block will always run,and is ensuring that

           // the Scanner object is closed after it’s used

           System.out.println("Age check process complete.");

           scanner.close();  // Always close the scanner to avoid resource leak

       }

   }



   // Method for If age valid, convert it to human age

   public static void checkCatAge(int age) {

       if (age <= 0) {

           // Throw an exception if the age is negative, as it's invalid

           throw new IllegalArgumentException("Cat's age cannot be negative.");

       }



       // Conversion

       int humanAge = age * 7;  // 1 cat year = about 7 human years



       // Print both ages

       System.out.println("The cat is " + age + " years old, which is about " + humanAge + " in human years.");

   }

}

References:

Morelli, R., & Walde, R. (n.d.). Java, Java, Java: Object-Oriented Programming. LibreTexts. https://eng.libretexts.org/Bookshelves/Computer_Science/Programming_Languages/Java_Java_Java_-_Object-Oriented_Programming_(Morelli_and_Walde)
