/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed
      //int x = 2;
      int num = 0;
      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
         int i = 0;             
         while(i < numElements){
            userList[i] = scnr.nextInt();
         
             //System.out.print(userList[i] + " ");
             
             i++;
         }
         
      
      
      for(int x = userList.length - 1; x >= 4; x--){
         
        System.out.print(userList[x] + " ");  
      }
    }
    
}
