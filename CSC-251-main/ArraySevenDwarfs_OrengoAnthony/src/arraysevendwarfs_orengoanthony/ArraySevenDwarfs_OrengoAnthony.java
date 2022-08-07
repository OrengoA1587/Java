package arraysevendwarfs_orengoanthony;

 /* Prgrammer: Anthony Orengo
  * Description: This program allows the user to choose the size of an 
    array list and input objects into that array list. The array list 
    will be displayed to the user using a normal loop and an advanced
    loop.
    Start Date: 09.28.2020
    End Date: 10/12/2020
  */
//Import array and scanner class
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArraySevenDwarfs_OrengoAnthony
{      
    /**
     *
     * @param args
     */
    //Main------------------------------------------------------------------////
    public static void main(String[] args)
   {
       //Create scanner object
       Scanner keyboard = new Scanner(System.in);
       //Declare and initialize menu sentinel
       boolean loop = false;
       String input;
        //Declare and initialize array list
       ArrayList nameList = new ArrayList();
       do
       {
           //Display menu to user
           System.out.print("Array List Program\n"
               + "****************************\n"
               + "1. Create and Display Array List\n"
               + "2. Display Pseudocode\n"
               + "3. Exit\n"
                   + "\nMake a selection --> ");
                //Get input from user
            input = keyboard.next();  
            switch(input){
                case "1":
                    GetDwarfNames(nameList);  
                    break;
                case "2":
                    //Displays pseudocode to user
                    DisplayPseudocode();                    
                    break;
                case "3":
                    //Ends program
                    loop  = true;
                    break;
                    
                default:                    
                    System.out.print("Invalid Selection");
                    break;                    
            }               
       }while(loop ==  false);       
   }//End of Main-----------------------------------------------------------////   
    //GetDwarfNames method--------------------------------------------------////
    public static void GetDwarfNames(ArrayList<String> nameList) {
           
       //Create scanner object
       Scanner keyboard = new Scanner(System.in);
        //Declare and initialize ArrayList
        nameList = new ArrayList<String>();
        //Declare and initialize index for names
        int index = 1;
        //Get array size from user
        System.out.print("\nEnter total number of names --> ");
        int num = keyboard.nextInt();
        //Get user to add names to list-------------------------------------////
        for(int i = 0; i < num; i++){
            System.out.print("Enter Name " + index + ": ");            
            nameList.add(keyboard.next());            
            index++;            
        }
        //Set index to 1
        index = 1; 
        System.out.println("***********************************************");
        System.out.println("Normal Loop:");
        System.out.println("\nThe ArrayList has " + nameList.size() + 
                " objects stored in it.");
        //Normal loop ------------------------------------------------------////
        for(int i = 0; i < nameList.size(); i++){
            
            System.out.println("Name " + index + ": "  + nameList.get(i));
           index++;
        } 
        System.out.println("***********************************************");
        System.out.println("Enhanced Loop:");
        System.out.println("\nThe ArrayList has " + nameList.size() + 
                " objects stored in it.");
        index = 1;
        //Enhanced Loop-----------------------------------------------------////
        for(String currentName : nameList){
            System.out.println("Name " + index + ": "  + currentName);
            index++;
        }       
    } 
    //End of GetDwarfNames method-------------------------------------------////
    //Pseudocode method-----------------------------------------------------////
    public static void DisplayPseudocode()
    {
        String pseudocode = "Pseudocode\n"
                          + "*****************************\n"
                + "1. Declare and initialize variables and array list\n"
                + "2. Create interactive user menu\n"
                + "3. Create Scanner object called keyboard"
                + "4. Get total number of names from user\n"
                + "5. Have user enter each name and add to array list\n"
                + "6. Display the elements of the array using a normal loop\n"
                + " and advanced loop.\n"
                + "7.Return to main menu";  
        System.out.println(pseudocode);
    }  
    //End of Pseudocode method----------------------------------------------////
}// End of class ArraySevenDwarfs_OrengoAnthony-----------------------------////
   
   
   





















































    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


