/*Description: This program calculates the number of soccer teams
that a youth league may create from the number of available players. 
Input validation is demonstarted with while loops.
 *Programmer: Anthony Orengo
 *Date: 02.19.2020 
 */
package soccerteams_orengoanthony;


import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
        
/**
 *
 * @author orengoa0459
 */
public class SoccerTeams_OrengoAnthony {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call Pseudocode method
        psuedocode();
        Start();
    }
    
    public static void Start(){
        final int MIN_PLAYERS = 9; //Minimum players per
        final int MAX_PLAYERS = 15;//Maximum players per
        ImageIcon image = new ImageIcon();
        int players; //Number of available
        
        int teamSize;//Number of players per
        
        int teams;//Number of teams
        int leftOver;//Number of left over
        
       
        boolean x = false;//Sentinel to control loop.
      
        String input;//To hold the user input
        
        //Get the number of players per team.
        input = JOptionPane.showInputDialog("Enter the number of players "
                + "per team.");
        
        teamSize = Integer.parseInt(input);
        
        //Validate the entered number
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
        {
            input = JOptionPane.showInputDialog("The number must be at least "+
                 MIN_PLAYERS + " and no more than " + MAX_PLAYERS + ".\n Enter"+ 
                          
                         " the number of players.");
            
            teamSize = Integer.parseInt(input);
        }
        
        //Get the number of available players
        input = JOptionPane.showInputDialog("Enter the available number of "
                + "players.");
        players = Integer.parseInt(input);
        
        //Validate number left over
        while(players < 0 )
        {
            input = JOptionPane.showInputDialog("Enter 0 or greater.");
            
            players = Integer.parseInt(input);
                 
        }
        //Calculate the number of teams
        teams = players / teamSize;
        //Calculate the number of left over players
        leftOver = players % teamSize;
        
        //Display the results
        JOptionPane.showMessageDialog(null, "There will be " + teams + 
                " teams with " + leftOver + " players left over.");
        
         if (leftOver > 0)
         {
            
            JOptionPane.showMessageDialog(null, "You have "+leftOver+" players "
                    + "left over.");
            //JOptionPane.showMessageDialog(null, "Both teams must be even.");
            
            
         }   
          else if (leftOver == 0)
          {
            
            JOptionPane.showMessageDialog(null, "Congratulations! "
                    + "You have no players left over.");
            x = true;//Ends the loop and program.
          } 
        
         
        Object [] teamNumber = new Object [teams];
        boolean loop = false;
        int teamIndex = 1;
                  
        int sizeIndex = 0;        
        int leftOverIndex = 1;
        int name = teamSize + leftOverIndex;
        do{
            
            if(sizeIndex < teamNumber.length){    
                
                teamNumber[sizeIndex] = teamSize;
                
                 if(leftOver != 0){
                
                     teamNumber[sizeIndex] = "Team: " + teamIndex + " has " + (teamSize + 1) + " Players";
                     System.out.println("Team: " + teamIndex +" " + teamNumber[sizeIndex]);
                    sizeIndex++;
                    teamIndex++;
                    leftOver--;
                 }
                 else if(leftOver == 0)
                 {
                     teamNumber[sizeIndex] = "Team: " + teamIndex + " has " + teamSize + " Players";
                     System.out.println("Team: " + teamIndex +" " + teamNumber[sizeIndex]);
                    sizeIndex++;
                    teamIndex++;                     
                 }        
            }

            else
            {
               loop = true;
               
            }
            
        }while(loop == false);    
        
       
            JOptionPane.showMessageDialog(null,teamNumber,"Soccer Teams",JOptionPane.INFORMATION_MESSAGE);
            
        
    }   
    
    public static void psuedocode(){
        
        String [] pseudo = new String[]{
         
            "Pseudocode",
            "--------------------------------------",
            "1. Declare Variables and constant variables.",
            "2. Get input from user number of players.",
            "4. Set condition to determine if user entered enough players.",
            "3. Get number of available players from user.",
            "4. Set condition to determine if the user has any left over"
                + " players .",
            "5. Display message for left over players",
            "6. Create decision structure to determine if players are "
                + "left over",
            "7. Display message if players are left over or display"
                + " congrats message",
            " if no players are left. ",
            "===============================================================",
                        
        };
        
        JOptionPane.showMessageDialog(null, pseudo, "Pseudocode", 
                JOptionPane.NO_OPTION);        
    }    
}
