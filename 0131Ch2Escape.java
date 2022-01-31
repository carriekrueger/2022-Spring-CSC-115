// Carrie Krueger
// 1-31-22
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2Escape {
    public static void main(String[] args) {
        escape(); // this method will explore output and escape sequences
    }
    
    
    // a method to investigate output and escape sequences
    public static void escape() {
        // print vs. println
        System.out.print("Hello Class!");  // next thing prints on same line
        System.out.println("It is Monday."); // next thing prints on next line
        System.out.println("Week 2...");
        
        System.out.println();  // prints a blank line 
        
        
        // OUTPUT 
        
        System.out.println(2);  // you can put text or numbers in a print statement
        System.out.println(1 + 2 * 3);  // you can even do math! (order of ops)
        
        // ESCAPE SEQUENCES
        // special characters denoted with \ (the escape character)
        
        // \n --> new line
        System.out.println("Hello!  \n\n\n");
        System.out.println("H\n\nello!");
        
        // \t --> tab
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\t\tHi");
        
        // \\ --> \
        System.out.println("\\");
        
        // \" --> "
        System.out.println("She said \"Java is the best language ever!!!\"");
        
        // You try!
        
        // 1. Think of a quote/saying that you know. 
        // 2. Create a new class called PrintQuote.java
        // 3. Output your saying with visible quotation marks in output. 
        //    ex. "That's the way the cookie crumbles!"
        
        // Use a method to print your quote!
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
