using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUI
{
    public static class CharacterSelection
    {
        public static void Characters(ref string [] characterSelection, ref int selectionNum)
        {
            
            selectionNum = 0;
            
            bool loop = false;
            characterSelection = new string[]
            {
                "Name: Columbus \n| Strength: 45/100 \n| Power 57/100 \n| Intelligence: 90 / 100 \n| Skills: 35 / 100",

                "Name: Tallahassee \n| Strength: 45/100 \n| Power 57/100 \n| Intelligence: 90 / 100 \n| Skills: 35 / 100",

                "Name: Witchita \n| Strength: 45/100 \n| Power 57/100 \n| Intelligence: 90 / 100 \n| Skills: 35 / 100",                

                "Name: Little Rock \n| Strength: 45/100 \n| Power 57/100 \n| Intelligence: 90 / 100 \n| Skills: 35 / 100",
                 

                "Name: Bill Murray \n| Strength: 45/100 \n| Power 57/100 \n| Intelligence: 90 / 100 \n| Skills: 35 / 100"                

             };

            ConsoleKeyInfo keyboard;
            do
            {
                Console.WriteLine("Choose your character.");
                Console.WriteLine("ZOMBIE ADVENTURE");
                Console.WriteLine("----------------------------------------------");
                Console.WriteLine("Current character: " + characterSelection[selectionNum]);
                //Get input from user by using keyboard
                keyboard = Console.ReadKey();
                //To control flow of movement through the array
                switch (keyboard.Key)
                {

                    case ConsoleKey.UpArrow:
                        //Decreases the array index number(roomNum) to move through the array
                        if (selectionNum > 0)
                        {
                            selectionNum--;
                            Console.WriteLine("Current Location: " + characterSelection[selectionNum]);

                        }
                        //If roomNum equals zero display you went to far. Controls the array boundary.
                        else if (selectionNum == 0)
                        {


                            Console.WriteLine("Current Location: " + characterSelection[selectionNum]);

                        }
                        break;

                    case ConsoleKey.DownArrow:
                        //If roomNum equals 5 display you went to far. Controls the array boundary.
                        if (selectionNum >= 0)
                        {
                            if (selectionNum == 4)
                            {

                                Console.WriteLine("Current Location: " + characterSelection[selectionNum]);

                            }
                            //Increases the array index number(roomNum) to move through the array 
                            else if (selectionNum >= 0)
                            {
                                selectionNum++;

                                Console.WriteLine("You are in the: " + characterSelection[selectionNum]);
                                Console.WriteLine("Keep going");
                            }

                        }

                        break;
                    case ConsoleKey.Enter:
                        loop = true;
                        break;
                    default:

                        //Display invalid choice if user inputs something not on the menu
                        Console.WriteLine("Invalid choice!");
                        break;
                }
                //Clears the current screen
                Console.Clear();

            } while (loop == false);
        }
    }
}
