using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUI
{
    public static class Scenario
    {
        public static ConsolePlayer.Player playerOne = new ConsolePlayer.Player();
        public static ZombieMobs.ZombieCoronaV ZombieCoronaV = new ZombieMobs.ZombieCoronaV();
        public static ZombieMobs.ZombieH1N1 ZombieH1N1 = new ZombieMobs.ZombieH1N1();


        public static void H1N1AttackScenario()
        {
            //string status ="";
            //int roomNum = 0;
            //int num2 = 0;
            Random randint = new Random();
            bool x = false;
            Console.Clear();
            Console.WriteLine(" ");
            Console.WriteLine("H1N1 Zombie scenario: " + ZombieH1N1.status);
            Console.WriteLine("-----------------------");
            Console.WriteLine(" You are currently in the hall and the H1N1 Zombie spotted you. You must make \n" +
                " a selection from the attack menu below. Take this time to view you weapon \n capabilities and" +
                " make the appropriate choice to defeat the zombie. Failing \n to do so, could result in you " +
                "becoming a zombie. Good luck warrior!");
            Console.WriteLine(" ");
            do
            {
                if (ZombieH1N1.health >= 1)
                   
                { 
                    Combat.ZombieCombat();
                    int H1N1 = randint.Next(50, 101);
                    ZombieH1N1.health -= H1N1;
                    if (ZombieH1N1.health >= 1)
                    {
                        Console.WriteLine("***** You did not kill the zombie. Attack again! ******");
                        
                    }
                }
                else if (ZombieH1N1.health <= 0)
                { 
                    Console.WriteLine("****** You killed the H1N1 Zombie ******");
                    Console.WriteLine("Great job warrior! You may continue on your journey. ");
                    ZombieH1N1.status = "Completed";
                    Console.ReadLine();
                    x = true;

                }
                Move.playerOne.health = +Combat.playerOne.health;
                Move.playerOne.armor = +Combat.playerOne.armor;

            } while (x == false);

        }

        public static void CoronaAttackScenario()
        {

            //int roomNum = 0;
            //int num2 = 0;

            Random randint = new Random();
            bool x = false;
            do
            {
                if (ZombieH1N1.health >= 1)
                {
                    Combat.ZombieCombat();
                    int corona = randint.Next(50, 101);
                    ZombieCoronaV.health -= corona;
                    if (ZombieH1N1.health >= 1)
                    {
                        Console.WriteLine("You did not kill the zombie. Attack again!");
                    }
                }
                else if (ZombieH1N1.health <= 0)
                {
                    Console.WriteLine("You killed the H1N1 Zombie");
                    x = true;

                }
                Move.playerOne.health = +Combat.playerOne.health;

            } while (x == false);

        }
    }
}
