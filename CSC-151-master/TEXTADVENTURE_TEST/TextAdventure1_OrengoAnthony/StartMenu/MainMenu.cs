using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StartMenu
{
    public static class MainMenu
    {
        public static string mainStartMenu()
        {
            //Declare and initilize loop variable
            int menuOptionsLoop = 1;

            //Loop to control main menu options
            do
            {
                Console.WriteLine("********************************************");
                Console.WriteLine("*                Main Menu                 *");
                Console.WriteLine("********************************************");
                Console.WriteLine("*                                          *");
                Console.WriteLine("*  1. Start Zombie Adventure               *");
                Console.WriteLine("*  2. Settings                             *");
                Console.WriteLine("*  3. Options                              *");                
                Console.WriteLine("*  4. Exit                                 *");
                Console.WriteLine("*                                          *");
                Console.WriteLine("********************************************");
                Console.Write("Select from the Menu -->");
                Console.Write(" ");

                //Get menu choice from user
                string menuChoice = (Console.ReadLine());

                //Use to control the selction of the main menu   
                switch (menuChoice)
                {

                    case "1":
                    case "Start":
                        //Console.WriteLine(Movement.StandarsMoveMessages.move());
                        //Console.WriteLine(Movement.StandarsMoveMessages.option());
                        //MAIN PROGRAM
                        menuOptionsLoop = 0;
                        break;
                    case "2":
                    case "Settings":
                    case "settings":
                    case "S":
                    case "s":
                    
                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*                 Settings               ***");
                        Console.WriteLine("********************************************");

                        string[] weapons = new string[] //String array to list weapons
                            {
                         "1. General",
                         "2. Video",
                         "3. Graphics",
                         "4. Sound",
                         "5. Controls"
                            };
                        foreach (var element in weapons)//Displays all the elements in the array
                        {
                            Console.WriteLine(element);
                        }
                        Console.WriteLine("-----------------------------------");
                        Console.WriteLine("Press enter to return to main menu:");
                        Console.ReadLine();
                        break;
                    case "3":
                    case "Options":
                    case "options":
                    case "O":
                    case "o":

                        Console.WriteLine(MenuChoice.MenuOptions.optionsMenu());
                        
                        break;
                    case "4":
                    case "Exit":
                    case "exit":
                    case "E":
                    case "e":
                        menuOptionsLoop = 0;

                        break;

                    default:
                        Console.WriteLine("Not a valid choice");                                           
                        break;
                                                                     
                }
            } while (menuOptionsLoop == 1);
            return""; 
        }
    }
}
