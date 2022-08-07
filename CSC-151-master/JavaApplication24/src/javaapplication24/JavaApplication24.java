/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import java.util.Scanner;
/**
 *
 * @author Anthony
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner scnr = new Scanner(System.in); 
      String inputMonth;
      int inputDay; 
      inputMonth = scnr.nextLine();
      inputDay = scnr.nextInt();
      
      if (inputMonth == "April" && inputDay == 11)
      {
         
         System.out.println("Spring");
      }
      else if (inputMonth == "March" && inputDay == 3)
      {
         
         System.out.println("Winter");
      }
      else if (inputMonth == "June" && inputDay == 21)
      {
         
         System.out.println("Summer");
      }
      else if (inputMonth == "November" && inputDay == 7)
      {
         
         System.out.println("Autumnn");
      }
      
      else{
         System.out.println("Invalid");
         
      }
      
      
    }
    
}
