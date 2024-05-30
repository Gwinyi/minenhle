package taskone;
   
import java.util.Scanner;


public class Login {
   private String registeredUN;
   private String registeredPW;
   public Login(String registeredUN, String registeredPW){
     this.registeredUN = registeredUN;
     this.registeredPW = registeredPW;
     




}
public void performLogin(){
    Scanner kb = new Scanner(System . in);
    System.out.println("------Welcome to the login menu------");
    System.out.println("Enter the username you created");
    String usernameCheck = kb.nextLine();
    System.out.println("Enter your password");
    String passwordCheck = kb.nextLine();
    //comparison
    if (usernameCheck.equals(registeredUN)&& passwordCheck . equals(registeredPW)) {
        System.out.println("Login succesful");
        System.out.println("You are welcome to task 1");
    }else{
        System.out.println("Login unsuccessful");
        System.out.println("Please re-enter your Login details");
      
}
    }

// Getter methods for encapsulation
    public String getRegisteredUN() {
        return registeredUN;
    }

    public String getRegisteredPW() {
        return registeredPW;
    }
   }
  