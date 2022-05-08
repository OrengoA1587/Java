/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ftccgpacalculator;

/**
 *
 * @author oreng
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class FtccGPACalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student stud = new Student();         
        JOptionPane.showMessageDialog(null,GetStudentInfo(stud));
      
        
    }
    public static Object[] GetStudentInfo(Student stud){
        int numC = 0;
        String input; 
        input = JOptionPane.showInputDialog(null,"Enter Students Name:  ");
        stud.name = input;
        input = JOptionPane.showInputDialog(null,"Enter Semester(spring,fall,etc.):  ");
        stud.semesterType = input;
        boolean loop = false;
        
        
          //ADD A LOOP to check if its a letter grad or correct number
       do{
            try{
                input = JOptionPane.showInputDialog(null,"Enter number of Classes ");

                numC = Integer.parseInt(input);
                char[] grade = new char[numC];
                double[] credits = new double [numC];  
                int track = 0;

                for(int i = 0; i < numC;i++)
                {            
                    input = JOptionPane.showInputDialog(null,"Enter the letter grade for class " + ":");
                    if(input.equals("A")|| input.equals("B")||input.equals("C")||input.equals("D")||input.equals("F")){
                        grade[i] = input.charAt(0); 

                        input = JOptionPane.showInputDialog(null,"Enter the number of Credits for class " + ":");
                        if(input.equals("1")|| input.equals("2")||input.equals("3")||input.equals("4")||input.equals("0")){

                            credits[i] = Double.parseDouble(input); 
                            track++;
                        }
                        else
                        {
                           JOptionPane.showMessageDialog(null,"Invalid Entry! You Must Enter a Number \nor Correct Letter Grade(A,B,C,D,F)"); 
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Invalid Entry! You Must Enter a Number \nor Correct Letter Grade(A,B,C,D,F)");
                    }
                }
                if(track == numC)
                {
                    loop = true; 
                    return CalculateGPA(stud, grade, credits);                       
                } 

            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Invalid Entry! You Must Enter a Number \nor Correct Letter Grade(A,B,C,D,F)");
            }  

       }while(loop == false);       
       return null;     
    }
    
    public static Object[] CalculateGPA(Student stud, char[] grade, double[] credits)
    {
        DecimalFormat df = new DecimalFormat("0.00");

        double GPA = 0;         
        double point = 0;
        double creditTotal = 0;
        for (int i = 0; i < grade.length;i++) 
        {
            if (grade[i] == 'A' || grade[i] == 'a'  ) {
                
                point += credits[i] * 4;          
                creditTotal += credits[i];
            }
            if (grade[i] == 'B' || grade[i] == 'b') {
                
                point += credits[i] * 3;
                creditTotal += credits[i];
            }
            if (grade[i] == 'C' || grade[i] == 'c') {
                
                point += credits[i] * 2;
                creditTotal += credits[i];
            }
            if (grade[i] == 'D' || grade[i] == 'd') {
             
                point += credits[i] * 1;
                creditTotal += credits[i];
            }
            if (grade[i] == 'F' || grade[i] == 'f') {
                
                point += credits[i] * 0;
                creditTotal += credits[i];
            }
            System.out.println(point);
            stud.GPA = point/creditTotal;
        }
        
        Object[] studentInfo = {"Student Information","Name:" + stud.name,"Semester: " + stud.semesterType,"GPA: " + df.format(stud.GPA)};
        
        
        return studentInfo;
    }
     
}
