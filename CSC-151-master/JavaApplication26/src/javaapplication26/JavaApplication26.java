/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Anthony
*/
import java.util.Scanner;
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      char triangleChar;
      int triangleHeight;
      
      System.out.println("Enter a character:");
      triangleChar = scnr.next().charAt(0);   
      
      System.out.println("Enter triangle height:");
      triangleHeight = scnr.nextInt();
      System.out.println("");
      
      for(int i = 1; i < triangleHeight; i++){
        System.out.println(triangleChar);
        
        
        for(int j = 1; j <= i; j++){
          System.out.print(triangleChar + " ");
           
        }
         
      }
      System.out.println(triangleChar);
      
    }
    
}
