/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_02_orengoanthony;

/**
 *
 * @author Anthony
 */
//Used to display JOptionPane Dialog box
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Homework_02_OrengoAnthony {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }
    
    public static void Menu(){
        
        Scanner keyboard = new Scanner(System.in);
        boolean menuLoop = false;
        
        
        do{       
           System.out.println("1. Hello");
           System.out.println("Choose from the menu");
        String input;
        input = keyboard.nextLine();
        switch (input)
        {
            
            case "1":
                System.out.println("Hello");
                
                
                
                break;
            
            
            
            
            
        }
            
            
        }while(menuLoop == false);
    }
}
