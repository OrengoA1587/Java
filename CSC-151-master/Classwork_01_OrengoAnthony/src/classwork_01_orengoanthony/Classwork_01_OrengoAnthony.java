 /*Description: This program displays the users name, age, and income by 
 obtaining input from the user through the scanner option and 
 JOptionPane method. 
 *Programmer: Anthony Orengo
 *Date: 01.25.2020 
 */

package classwork_01_orengoanthony;

//Java class package used to get input from user//
import java.util.Scanner;
//Java class package used to provide message dialog box//
import javax.swing.JOptionPane;

//Beginning of Classwork_01_OrengoAnthony//
public class Classwork_01_OrengoAnthony {

    /**
     * @param args the command line arguments
     */
    
    //Beginning of main method//
    public static void main(String[] args) {
        
        //Calls the pseudocode, scannerOption,pseudoJOption,jOption methods
         pseudocode();
         scannerOption();
         pseudoJOption();
         jOption();
            
            
    }//Ending of main method//      
    
    //-------Beginning of Method pseudocode ---------------------------------//
    public static void pseudocode()
    { 
        /* Displays the pseudocode for the program using the print option*/
        System.out.println("Pseudocode");
        System.out.println("Program: CorrectedInputProblem");
        System.out.println("Programmer: Anthony Orengo");
        System.out.println("Date: 01/25/2020");
        System.out.println("");
        System.out.println("1. Import scanner and JOption class");
        System.out.println("2. Declare Variables");
        System.out.println("* String name");
        System.out.println("* int age");
        System.out.println("* double income");
        System.out.println("3. Create scanner object to read input from user");
        System.out.println("4. Get users age, income, and name");
        System.out.println("5. Display information to the user using the "
                + "print option and JOptionPane dialog box");
                
    }
    //========End of pseudocode===========================================//
    
    //--------Beginning of Scanner option--------------------------------//
    public static void scannerOption(){
       
       //Declared variables for Scanner option//
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
       System.out.println("Hello, " + name + "."+
               " Your age is " + age + " and your income is $" + income);
       
                   
    }
    //=======End of Scanner Option=======================================//
    //--------Beginning of Pseudocode(JOption display)------------------//  
      
    
    public static void pseudoJOption(){
        
        /* String array created to display pseudocode*/       
        String [] pseudoCode = {            
        
        "-------------------------------",
        "Program Name: CorrectedInputProblem",
        "Programmer Name: Anthony Orengo",
        "Date: 01/25/2020",
        "",
        "1. Import scanner and JOption class",
        "2. Declare Variables",
        "   * String name",
        "   * int age",
        "   * double income",
        "3. Create scanner object to read input from user",
        "4. Get users age, income, and name",
        "5. Display information to the user using the ",
        "print option and JOptionPane dialog box"
        };
        //Displays the array in message dialog box//
        JOptionPane.showMessageDialog(null, pseudoCode, "Pseudocode", 
                JOptionPane.NO_OPTION); 
        
    }
    //=======Ending of Pseudocode(JOption display)==========================//
    
    //-------Beginning of JOption Method-----------------------------------//
    public static void jOption(){
           
         //Declared variables for jOption method//
         String name;
         int age;
         double income;
         
         //Get users name
         name = JOptionPane.showInputDialog("What is your name? ");
         //Get user age
         String inputString = JOptionPane.showInputDialog("What is your age? ");
         //Convert variable age("String") to integer
         age = Integer.parseInt(inputString);
         //Get users annual income
         inputString = JOptionPane.showInputDialog("What is your annual "
                                                         + "income? ");
         //Convert variable income("String") to integer
         income = Integer.parseInt(inputString);
         //Displays output in a message dialog box//
         JOptionPane.showMessageDialog(null, " Hello, " + name + 
                                        ". Your age is " + age + 
                                     " and your annual income is $" + income);
        //Displays output in a message dialog box "Good Bye"// 
        JOptionPane.showMessageDialog(null,"Good Bye");
        //-------Ending of JOption Method-------------------------------// 
    }  
    
}//Ending of Classwork_01_OrengoAnthony//
