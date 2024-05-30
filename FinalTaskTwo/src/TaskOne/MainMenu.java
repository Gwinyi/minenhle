package taskone;
import java.util.Scanner;
import taskone.Register;
public class MainMenu {

   
    public static void main(String[] args) {
        
              mainMenu();
        
        
        
        
        
           }

    public static void mainMenu() {
        
    
    Scanner kb = new Scanner(System.in);
    int choice;
    Register register = new Register();//Register instance
    
    
     do  {
            System.out.println("-----Main Menu------");
            System.out.println("Enter 1 --> To receive instructions");
            System.out.println("Enter 2 --> Login");
            System.out.println("Enter 3 --> Register");
            System.out.println("Enter 0 --> Exit");
            
            
            choice = kb.nextInt();
            kb.nextLine();//continue the newline left-over
          
     
            switch(choice){
                case 1:
                    System.out.println("Instructions arriving soon");
                    break;
                case 2:
                    Login login = new Login(register.registeredUN, register.registeredPW);
                    login.performLogin();
                    break;
                
                case 3 :
                    register.registeruser();
    
            break;
                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid entry\nPlease enter a valid option...");
                    break;
            
            }
}while(choice !=0);
     kb.close(); // Close scanner when done using it
}
}
                
                
                
                
                
            
            
    
    


    
    
    
   
