/**
* 02.08.2020
* CSC 153
* Anthony Orengo
* Program description: This program displays the main menu
* and what each main menu item contains. 

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
        public static ConsolePlayer.Player playerOne = new ConsolePlayer.Player();
                        
        static void Main(string[] args)
        {

            SplashScreen.Splash();
            MainMenu.mainStartMenu();
            Start();
        }

        public static void Start()
        {
            Console.Clear();
            Console.WriteLine("Enter your Name: ");
            string name = Console.ReadLine();
            int roomNum = 0;
            string[] character = new string[4];

            Console.WriteLine($"Welcome to Zombie Adventure {name}");
            Console.WriteLine(" ");
            CharacterSelection.Characters(ref character, ref roomNum);
            Move.CharacterMovement(character[roomNum]);
        }


    }

    
}
