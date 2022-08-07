
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static loginmenu.LoginMenu.calculator;
import static loginmenu.LoginMenu.createAccount;
import static loginmenu.LoginMenu.exitMenu;
import static loginmenu.LoginMenu.login;
import static loginmenu.LoginMenu.quiz;
public class CorrectedInputProblem {

    /**
     * @param args the command line arguments
     */
    public static void pseudocode()
    { 
        System.out.println(" Psuedocode"+
                "Program: CorrectedInputProblem" +
                "Programmer: Anthony Orengo" +
                "Date: 01/15/2020" +
                ""+
                "1. Import java.util.Scanner" +
                "2. Declare Variables"
                + "* String name"
                + "* int age"
                + "* double income"+
                "3. Create scanner to read input from user"+
                "4. Get users age, income, and name" +
                "5. Display information to the user");
                
    }    
    
    public static void menu(){
        
        
        String [] mainMenu = 
        {
        
                       
            ("1. Scanner Option"),
            ("2. JOption"),
            ("3. Exit")        
            
        };        
        String menuOption = JOptionPane.showInputDialog(null, mainMenu, "Welcome to the Main Main Menu",JOptionPane.OK_CANCEL_OPTION);
        
        
        if ("1".equals(menuOption)){
           scannerOption();
          
        }
        else if("2".equals(menuOption)){
            
           jOption();
        }
        else if("3".equals(menuOption)){
            login();
        }
        
        
    }
    public static void scannerOption(){
       
       String name;
       int age;
       double income;          
       
       /* Creates keyboard scanner to read input from user*/
       Scanner keyboard = new Scanner(System.in);
       
       //Get users age
       System.out.println("What is your age?");
       age = keyboard.nextInt();
       
       //Get users income
       System.out.println("What is your annual income?");
       income = keyboard.nextDouble();
       
       //Consumes the remaining line
       keyboard.nextLine();
       
       //Get users name
       System.out.println("What is your name?");
       name = keyboard.nextLine();
              
       //Display the information to the user
       System.out.println("Hello, " + name + 
               "Your age is " + age + " and your income is $" + income);
       
                   
    }
    
    public static void jOption(){

         String name;
         int age;
         double income;
         
         name = JOptionPane.showInputDialog("What is your name? ");
         
         String inputString = JOptionPane.showInputDialog("What is your age? ");
         
         age = Integer.parseInt(inputString);
         
         inputString = JOptionPane.showInputDialog("What is your annual income? ");
         income = Integer.parseInt(inputString);
         
         JOptionPane.showMessageDialog(null, " Hello, " + name + ". Your age is " + age + 
                 " and your annual income is $" + income);
    }
     
    
        
    
    
    public static void main(String[] args) {
       /*Displays Pseudocode from created methos*/
       pseudocode();
       menu();
    }
        
}
    

