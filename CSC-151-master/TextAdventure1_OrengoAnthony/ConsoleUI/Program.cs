/**
* 02.08.2020
* CSC 153
* Anthony Orengo
* Program description: This program displays the main menu
* and menu options for Zombie Adeventure. 

*/




using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUI
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("********************************************");
            Console.WriteLine("*****                                  *****");
            Console.WriteLine("*****            Welcome To            *****");
            Console.WriteLine("*****         Zombie Adventure         *****");
            Console.WriteLine("*****                                  *****");
            Console.WriteLine("********************************************");
            Console.WriteLine("********************************************");
            Console.WriteLine("*                                          *");
            Console.WriteLine("*                                          *");
            Console.WriteLine("*            ***************               *");
            Console.WriteLine("*        *                     *           *");
            Console.WriteLine("*      *  ______        ______   *         *");
            Console.WriteLine("*    *   / *****      / *****     *        *");
            Console.WriteLine("*    *   *  (o) *     * (o)  *    *        *");
            Console.WriteLine("*    *   *      *     *      *    *        *");
            Console.WriteLine("*    *     ****         ****      *        *");
            Console.WriteLine("*    *              *             *        *");
            Console.WriteLine("*      *          *___*          *         *");
            Console.WriteLine("*        *        *****        *           *");
            Console.WriteLine("*        *     ***********     *           *");
            Console.WriteLine("*        *   * [][][][][] *    *           *");
            Console.WriteLine("*        *   * [][][][][] *    *           *");
            Console.WriteLine("*          *   ********** *   *            *");
            Console.WriteLine("*            *             *               *");
            Console.WriteLine("*              * * * * * *                 *");
            Console.WriteLine("*                                          *");
            Console.WriteLine("********************************************");
            Console.WriteLine("");
            Console.WriteLine("");
            //Declare and initilize loop variable
            int menuOptionsLoop = 1;

            //Loop to control main menu options
            while (menuOptionsLoop == 1)
            {
                
                Console.WriteLine("********************************************");
                Console.WriteLine("*                Main Menu                 *");
                Console.WriteLine("********************************************");
                Console.WriteLine("*                                          *");
                Console.WriteLine("*  1. Display Rooms                        *");
                Console.WriteLine("*  2. Display Weapons                      *");
                Console.WriteLine("*  3. Display Potions                      *");
                Console.WriteLine("*  4. Display Treasure                     *");
                Console.WriteLine("*  5. Display Items                        *");
                Console.WriteLine("*  6. Display Mobs                         *");
                Console.WriteLine("*  7. Exit                                 *");
                Console.WriteLine("*                                          *");
                Console.WriteLine("********************************************");
                Console.WriteLine("Select from the Menu:");

                //Get menu choice from user
                string menuChoice = (Console.ReadLine());
                               
                    //Use to control the selction of the main menu   
                    switch (menuChoice)
                    {
                        case "1":
                        case "Room":
                        case "Rooms":
                        case "room":
                        case "rooms":
                        
                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*  Rooms Menu                            ***");
                        Console.WriteLine("********************************************"); 

                            string[] rooms = new string[] //String array to list rooms
                            {
                         "1. Living Room",
                         "2. Kitchen",
                         "3. Master Bedroom",
                         "4. Bedroom 1",
                         "5. Bathroom"

                            };

                            foreach (var element in rooms) //Displays all the elements in the array
                            {
                                Console.WriteLine(element);
                            }
                        Console.WriteLine("-----------------------------------");
                        Console.WriteLine("Press enter to return to main menu:");                        
                        Console.ReadLine();

                            break;
                        case "2":
                        case "Weapon":
                        case "Weapons":
                        case "weapon":
                        case "weapons":
                        
                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*  Weapons Menu                          ***");
                        Console.WriteLine("********************************************");

                        string[] weapons = new string[] //String array to list weapons
                            {
                         "1. Knife",
                         "2. Pistol",
                         "3. Shotgun",
                         "4. Automatic Rifle"
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
                        case "Potion":
                        case "Potions":
                        case "potion":
                        case "potions":
                       

                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*  Potion Menu                           ***");
                        Console.WriteLine("********************************************");

                        string[] potions = new string[] //String array to list all potions
                            {
                         "1. 100% Health",
                         "2. 50% Armor"
                            };
                            foreach (var element in potions)//Displays all the elements in the array
                        {
                                Console.WriteLine(element);
                            }
                        Console.WriteLine("-----------------------------------");
                        Console.WriteLine("Press enter to return to main menu:");
                        Console.ReadLine();
                        break;
                        case "4":
                        case "Treasure":
                        case "treasure":
                        case "Treasures":
                        case "treasures":
                        
                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*  Treasure Menu                         ***");
                        Console.WriteLine("********************************************");

                        string[] treasures = new string[] //String array to list all treasures
                            {
                        "1. Ammo Crate",
                        "2. Body Armor",
                        "3. First Aid Kit"
                            };
                            foreach (var element in treasures)//Displays all the elements in the array
                        {
                                Console.WriteLine(element);
                            }
                        Console.WriteLine("-----------------------------------");
                        Console.WriteLine("Press enter to return to main menu:");
                        Console.ReadLine();

                        break;
                        case "5":
                        case "Item":
                        case "Items":
                        case "item":
                        case "items":
                        
                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*  Items Menu                             ***");
                        Console.WriteLine("********************************************");

                        List<string> items = new List<string>();//String List to list all items

                        items.Add("1. Map");
                            items.Add("2. Compass");
                            items.Add("3. Flashlight");
                            items.Add("4. First Aid Kit");

                            foreach (var element in items)//Displays all the elements in the list
                        {
                                Console.WriteLine(element);
                            }
                        Console.WriteLine("-----------------------------------");
                        Console.WriteLine("Press enter to return to main menu:");
                        Console.ReadLine();
                        break;
                        case "6":
                        case "Mob":
                        case "Mobs":
                        case "mobs":
                        case "mob":
                        
                        Console.WriteLine("");
                        Console.WriteLine("");
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*  Monster Menu                          ***");
                        Console.WriteLine("********************************************");

                        List<string> monsters = new List<string>();//String List to list all monsters

                            monsters.Add("1. H1N1V-Zombie");
                            monsters.Add("2. CoronaV-Zombie");
                            monsters.Add("3. RotaV-Zombie");
                            monsters.Add("4. EbolaV-Zombie");
                            monsters.Add("5. MarburgV-Zombie");

                            foreach (var element in monsters)//Displays all the elements in the list
                        {
                                Console.WriteLine(element);
                            }
                        Console.WriteLine("-----------------------------------");
                        Console.WriteLine("Press enter to return to main menu:");
                        Console.ReadLine();
                        break;
                       case "7":
                       case "E":
                       case "e":
                       case "Exit":
                       case "exit":
                        menuOptionsLoop = 0;//Exits loop and program
                        Console.WriteLine("********************************************");
                        Console.WriteLine("*****                                  *****");
                        Console.WriteLine("*****                                  *****");
                        Console.WriteLine("*****          Come Back and           *****");
                        Console.WriteLine("*****            PLAY soon!            *****");
                        Console.WriteLine("*****                                  *****");
                        Console.WriteLine("*****                                  *****");
                        Console.WriteLine("********************************************");
                        Console.ReadLine();
                        break;

                        //Default option to return to main menu after incorrect slection
                        default:

                        break;



                    }

                

            }


           








        }

    }

    
}
