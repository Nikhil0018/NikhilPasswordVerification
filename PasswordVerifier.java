import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerifier{
    public static void main(String[] args) {
        
        String inputPassword = takeInput();
        verifyPassword(inputPassword);

    }

    public static String takeInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password : ");
        return scanner.nextLine();
        
    }
    public static boolean verifyPassword(String password){
        
        try{

            boolean isNull = password.length() == 0;
           
            if(isNull){

                throw new PasswordExceptions(0);

            }else{

                boolean isLengthMoreThan8 = password.length()>8 ? true : false;

                if(!isLengthMoreThan8){

                    throw new PasswordExceptions(1);  

                }else{

                    boolean hasLowerCase = !password.equals(password.toUpperCase());

                    if(!hasLowerCase){

                        throw new PasswordExceptions(2);

                    }else{

                        boolean hasUpperCase = !password.equals(password.toLowerCase());

                        if(!hasUpperCase){

                            throw new PasswordExceptions(3); 

                        }else{

                            Pattern digitPattern = Pattern.compile("(.)*(\\d)(.)*");
                            boolean hasAnyDigit = digitPattern.matcher(password).matches();                

                            if(!hasAnyDigit){

                                throw new PasswordExceptions(4);

                            }else{

                                System.out.println("Password Accepted");
                                return true;

                            }
                        }

                    }

                }

            }
            
                     
        }catch(PasswordExceptions passwordException){

            return false;

        }
        

    }


}
