package bug_04_orengoanthony;
/*Description: This program determines loan eligibility by evaluating years with 
current job and salary.
 *Programmer: Anthony Orengo
 *Date: 02.12.2020 
 */
import java.util.Scanner;
public class Bug_04_OrengoAnthony
{
   public static void main(String[] args)
   {
      double salary;       // Annual salary
      double yearsOnJob;   // Years at current job
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter your annual salary: ");
      salary = keyboard.nextDouble();
      System.out.print("Enter the number of years at your current job: ");
      yearsOnJob = keyboard.nextDouble();
      if (salary >= 50000 && yearsOnJob >= 2)
      {
          System.out.println("You qualify for the loan.");
      }
      else
      {
         System.out.println("You do not qualify.");
      }
   }
}

