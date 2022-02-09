// Carrie Krueger
// 2-9-22
// How to use a Scanner to read user input from the keyboard

import java.util.Scanner;
// To read from the keyboard, use a premade java class called Scanner
// Certain premade classes need to be imported to be used
// String, Math: no import      Scanner: needs import


public class KeyboardInput {
    public static void main(String[] args) {
        readInput(); // read input from the keyboard
    }
    
    //a method that will read input from the keyboard
    public static void readInput() {
        
        String name;
        int age;
        
        // INSTANTIATE (create) a Scanner that reads from the keyboard 
        
        // This makes a Scanner called sc:
        
        Scanner sc = new Scanner(System.in);
        //      ^ why sc?  could have named it anything... 
        //      descriptive names are helpful
        
        // Prompt user for information
        // use the .nextLine() method to read and store text
        
        System.out.println("What is your full name?");
        name = sc.nextLine(); // reads in line of text and stores it
        
        // Scanners have methods to read in data until there is a
        // space or a newline
        // Use .nextInt() to read and store an int
        
        System.out.println("Enter your age:");
        age = sc.nextInt();
        
        // Echo
        System.out.println("Hello, " + name + ", how does it feel being " + age + "?");
        
        sc.close(); // close the Scanner (makes the compiler happy, sometimes useful)
        
    
  
        
        
    }
}
