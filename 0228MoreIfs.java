// Carrie Krueger
// 2-28-22
// Efficiently using if-statements and multiple conditionals

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        betterIfs();  // efficient if statements
        multipleConditionals(); // a look at multiple conditionals
 
       
    }
    
    // a method that shows the preferred way to handle 
    // code that is being reused
    public static void betterIfs() {
        
        // When you have code that ends up being reused in your program:
        
        // preferred way
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
        }
        
        System.out.println(age + " is a good age.");
        
        
        /* less preferred way
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }
        
        if(age < 65) {
            System.out.println(age + " is a good age.");
        }
        
        */
    }
    
    
    // this method looks at ways to do multiple conditionals
    public static void multipleConditionals() {
        
        // let's compare a number to 10 in a better way than we did before
        // mulitple to ways to handle multiple conditionals 
        
        int num = 112;
        
        // only ONE outcome possible
        // NESTED
        // note the indentation -  if/else { --> INDENT next line
        
        if(num > 10) {
            System.out.println("Greater than 10!");
        } else {
            if(num < 10) {
                System.out.println("Less than 10!");
            } else {
                System.out.println("Equal to 10!");
            }
        }
        
        // only one outcome possible
        // nesting but neater --> else if 
        
        if(num > 10) {
            System.out.println("Greater than 10!");
        } else if(num < 10) {
            System.out.println("Less than 10!");
        } else {
            System.out.println("Equal to 10!");
        }
        
        // more than one outcome possible 
        // not nested (stack)
        
        if(num > 10) {
            System.out.println("Greater than 10!");
        }
        
        if(num > 100) {
            System.out.println("Really big number!");
        }
        
        num = 2;
        // Boolean Logic Operators 
        
        // AND &&
        // Short-circuit!! (skip checking second condition)
        
        if(num >= 40 && num <= 60) {
            System.out.println("num is in range!");
        }
        
        // OR ||  (short circuit also here)
        
        if(num > 40 || num <= 10) {
            System.out.println("You win!");
        }
        
        
        // Another option: SWITCH STATEMENTS
        // Book: 6.3 
        
        // Pros and cons:
        // if/else statements can handle ranges
        // switch statements can only handle exact values 
        // switch statements can only be used with certain primitives and String
        // if/else can get messy with { }, more prone to errors (syntax and logic)
        
        
     
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
