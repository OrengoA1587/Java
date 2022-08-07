/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteloccupancy;

/**
 *
 * @author Anthony
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class HotelOccupancy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HotelOccupancyRate();
    }
    
    public static void HotelOccupancyRate()
    {
        //Declare Variables
        int numberOfFloors = 0;
        int numberOfRoomsOccupied=0;
        double totalNumberOfRooms =0;
        double occupancyRate = numberOfRoomsOccupied / totalNumberOfRooms; 
        int[] floors = new int[numberOfFloors];
        int[] occupied = new int[numberOfRoomsOccupied];
        
        int index = 0;
        boolean loop = false;
        String input;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        do{
            System.out.println("Main Menu");
            System.out.println("1. Enter number of floors");
            System.out.println("2. Enter number of rooms");
            System.out.println("3. Display information");
            System.out.println("4. Exit");
            
            input = keyboard.nextLine();
            switch(input)
            {
                case "1":
                      
                    System.out.print("Enter number of floors ==> ");             
                    int num;
                    input = keyboard.nextLine();
                     num = Integer.parseInt(input);
                     if(num <=1)
                     {
                         System.out.println("Invalid floor number!");
               
              
                     }          
            
                     else if (num > 1)
                     {  
                      numberOfFloors = num;
                      System.out.println(numberOfFloors);
               
                     }         
                
                 break;             
                
                case "2":
                    EnterRooms(floors,occupied, index, loop);     
                    
                    
                    break;
                case "3":                                                        
                    System.out.println(numberOfFloors);   
                    System.out.println(numberOfRoomsOccupied);         
                    System.out.println(totalNumberOfRooms);         
                    break;
                case "4":                                                        
                    loop = true;                    
                    break;
                
                default:
                    System.out.println("Invalid selection!");
                    break;
                
            }                         
           
        }while(loop == false);
    }
        
        
    public static void EnterFloors(int numberOfFloors, boolean loop, int num){
         Scanner keyboard = new Scanner(System.in);     
         
         String input;
                
    }         
    
    
    public static void EnterRooms(int floors[],int occupied[], int index, boolean loop){
         Scanner keyboard = new Scanner(System.in);     
         int floorNum = 1;
         int input;
         for(int x = 0;x<= floors.length;x++ ){
             
             
             System.out.print("Enter number of rooms for floor" + floorNum + " ==> ");
             input = keyboard.nextInt();
           
                 if(input >= 10){
                     floors[index]=input;
                     loop = true;
                 }
                 else if(input < 10){
                     System.out.println("Invalid number of rooms!");
                     System.out.println("Rooms must be greater than 10 per floor!");
                 }
             
             
             
             
             System.out.print("Enter number of occupants for floor" + floorNum + " ==> ");
             input = keyboard.nextInt();
             occupied[index]=input;             
             index++;
             floorNum++;            
             
         }
         
        
                        
        
    }        
}
