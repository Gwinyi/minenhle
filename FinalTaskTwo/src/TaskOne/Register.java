package taskone;
import java.util.Scanner;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Register {
public String registeredUN;
public String registeredPW;

    public void registeruser(){
       //declarations
        boolean checkUsername = false;
        boolean checkPasswordComplexity = false;
        String username;
        String password;
        String name;
        String surname;
        Scanner kb = new Scanner(System . in);

        //username checking
        do{
            System.out.println("Please make sure username consists an underscore and is not longer than 5 letters long");
            username = kb.nextLine();
            checkUsername = username . contains("_")& username.length()>=5;
            if (checkUsername){
                System.out.println("username invalid - please ensure it consists of an underscore and is 5 letters or less in length");
            } 
} while (checkUsername);

      //Password check
      do{
          System.out.println("Password must contain: \n"
                             +"(1) At least one Capital letter\n"
                             +"(2) At least one number\n"
                             +"(3) At least one special character[!@#$%^&*]\n"
                             +"(4) Must be at least 8 characters in length");
          password = kb.nextLine();
          
          Pattern specialPattern = Pattern.compile("[^A-Za-z0-9]");
          Pattern digitPattern = Pattern.compile("\\d");
          Pattern capsPattern = Pattern.compile("[A-Z]");
          
          Matcher specialMatcher = specialPattern . matcher(password);
          Matcher digitMatcher = digitPattern.matcher(password);
          Matcher capsMatcher = capsPattern . matcher(password);
          
          
        checkPasswordComplexity = password.length() >= 8
               && specialMatcher . find()
               && digitMatcher . find()
               && capsMatcher . find();
        if (!checkPasswordComplexity ){
            System.out.println("Invalid password - please go over password specifications again");
}

        }while (!checkPasswordComplexity);

        System.out.println("Enter your first name: ");
            name = kb.nextLine();
        System.out.println("Enter your surname: ");
            surname = kb .nextLine();

     registeredUN = name;
     registeredPW = password;
        System.out.println("-----You are now registered!!-----");
        }
        
        
        
        
        
        
        
    }
   
    
