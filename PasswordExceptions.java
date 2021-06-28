import java.io.*;

public class PasswordExceptions extends Exception{

    public PasswordExceptions(int exceptionCode){

        switch(exceptionCode){
            case 0:
                System.out.println("NullException - Entererd password is null");
                break;
            case 1:
                System.out.println("LengthException - Entered password is less than 9 chars");
                break;
            case 2:
                System.out.println("LowerCaseException - Entered password does not contain any lowercase characters");
                break;
            case 3:
                System.out.println("UpperCaseException - Entered password does not contain any uppercase characters");
                break;
            case 4:
                System.out.println("NumberException - Entered password does not contain any number");
                break;
            default:
                System.out.println("DefaultException - Try again!");
                break;
        }

    }
    
}
