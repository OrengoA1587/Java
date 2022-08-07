using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUI
{
    class Combat
    {
        public static ConsolePlayer.Player playerOne = new ConsolePlayer.Player();

        public static void ZombieCombat()
        {

            Random randint = new Random();

            Console.WriteLine(MovementLibrary.StandarsMoveMessages.AttackMenu());

            string input = Console.ReadLine();
            Console.Clear();
            if (input == "1")
            {
                int coins = randint.Next(1, 10);
                int healthAttack = randint.Next(1, 20);
                int armorAttack = randint.Next(1, 20);
                Console.WriteLine("----------------------");
                Console.WriteLine("|You chose to attack!|");
                Console.WriteLine("|--------------------|");
                Console.WriteLine("|Current Status      |");
                Console.WriteLine("|Health meter: " + playerOne.health + "   |");
                Console.WriteLine("|Armor meter: " + playerOne.armor + "   |");
                Console.WriteLine("----------------------");

                if (playerOne.armor <= 100)
                {
                    playerOne.armor -= armorAttack;
                }
                else if (playerOne.armor <= 0 && playerOne.health >= 100)
                {
                    playerOne.health -= healthAttack;
                }
              
                int coinsEarned = playerOne.coins += coins;
                Console.WriteLine(" ");
                Console.WriteLine("Total damage: " + healthAttack);
                Console.WriteLine("Current Armor" + playerOne.armor);
                Console.WriteLine("Current Health" + playerOne.health);
                Console.WriteLine("Coins earned: " + coinsEarned);
                Console.ReadLine();
                Console.Clear();
                if (playerOne.health <= 0)
                {
                    Console.WriteLine("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.");
                    Console.WriteLine("The zombie killed you");
                    Console.WriteLine(" ");

                    SplashScreen.EndMessage();
                }
                else
                {

                }

            }

            else if (input == "2")
            {
                int attack = randint.Next(100, 100);
                if (attack == 100)
                {
                    Console.WriteLine("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.");
                    Console.WriteLine("The zombie killed you");
                    Console.WriteLine(" ");

                    SplashScreen.EndMessage();


                }
                else if (attack < 100)
                {
                    Console.WriteLine("You sustained major damage: " + attack);
                }
            }
            else
            {
                Console.WriteLine("Invalid option");
            }
        }
    }
}
