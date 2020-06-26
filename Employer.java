
 
package employer;

import java.util.Scanner;

public class Employer 
{

    
    
     
    public static void main(String[] args) 
    {
     Scanner userInputScanner = new Scanner(System.in);
     //Declaration of local variable
     String emplName;
     String emplAddress;
     String emplPosition;
     
     System.out.println("n/nWelcome to ITSD322 Developing OOP Java programs!");
     System.out.println("------------------------------------------------");
     
     //program data IPO Input,Processing,Output
     
     //Prompt the user to enter name, address, and position
     System.out.println("Enter your Employer's  Name: ");
     emplName = userInputScanner.nextLine();
     
     System.out.println("Please enter your Employer's Address: ");
     emplAddress = userInputScanner.nextLine();
     
     System.out.println("Enter your Position: ");
     emplPosition = userInputScanner.nextLine();
     
     //the output results
     
     System.out.println("Your employer's name is: " + emplName);
     System.out.println("Your Employer's Address is: " + emplAddress);
     System.out.println("Your position is: " + emplPosition);
     
     System.out.println("-------------END OF PROGRAM---------------");
    }
    
}
