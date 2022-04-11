// Carrie Krueger
// 4-11-22
// Partial code for validatePassword() method from Project: Password Suite


public class PasswordValidateNotes {
	
	public static void main(String[] args) {
	    
	    // partial main method code
	    // input is the password that the user typed in to check 
	    
	    if(validatePassword(input) == true) {
	    	System.out.println("Password valid");
	    } else {
	        System.out.println("Password invalid");
	    }
	}
	
	// this method takes a String password and returns true if the password
	// is valid according to the rules
	public static boolean validatePassword(String input) {

        //Rules:  at least 8 chars, at least 1 capital, at least 2 numbers 

        // check length for 8 characters

        if(input.length() < 8) {
            return false;
        }

        // check for at least 1 capital letter

        int loopCounter = 0;
        int capitalCounter = 0;

        while(loopCounter < input.length()) {

            char ch = input.charAt(loopCounter);

            if(ch >= 'A' && ch <= 'Z') {
                capitalCounter++;
            }

            loopCounter++;
        }

        // check for at least 2 numbers 
        // WRITE THIS PART OF THE CODE!!!!!

        if(capitalCounter >= 1 && numberCounter >= 2) {
            return true;
        } 
        return false;

    }

}
