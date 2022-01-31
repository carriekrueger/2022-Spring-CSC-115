// Carrie Krueger
// 1-31-22
// Chapter 2 Notes - Comments 

public class Ch2Comments {
    public static void main(String[] args) {
        comments();  // in this method we will explore comments
    }
    
    // a method to investigate comments
    public static void comments() {
        
        // anything you type in a comment is NOT read 
        // by the computer/compiler
        
        // We use comments for: 
        // - Adding your name to the program
        // - Adding a brief description of the program
        // - As you go along, explain to others (and yourself)
        //   what your code should do 
        
        // ALSO - Debugging
        // If there's code that doesn't work... yet
        // If there's a bunch of lines of code that don't work
        // and you want to isolate them
        
        
        // GIVE CREDIT
        // If you use someone's code, use comments to credit them
        // ex. shamelessly stolen from https://github.com/awesomecoder
        
        // HOW TO MAKE COMMENTS?
        
        // Line comments: anything after the // is ignored by the compiler 
        // Block comments: /*   */   (slash star star slash) (comment sandwich)
        // Java Doc comments /**  */ (automatically generate code documentation)
        //                           (we won't use here but useful for later)
        
        
        // Examples:  
        
        /* When you have multiple lines of comments
           it's helpful to do a block comment
           because you can add as many lines as you want.
           Good for name/desription at top of program.
        */
        
        
        // HOW TO USE FOR DEBUGGING
        
        System.out.println("Hello, World!");
        /*
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        */
        System.out.println("Hello, World!");
        //System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
