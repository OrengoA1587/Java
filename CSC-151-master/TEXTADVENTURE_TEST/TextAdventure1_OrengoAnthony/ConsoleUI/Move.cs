using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUI
{
    public static class Move
    {
        public static ConsolePlayer.Player playerOne = new ConsolePlayer.Player();
        public static ZombieMobs.ZombieH1N1 ZombieH1N1 = new ZombieMobs.ZombieH1N1(); 

        public static void CharacterMovement(string character)
        {

            bool loop = false;
            int roomNum = 9;
            int num2 = 10;



            //string hi = "Welcome to the start";
            //string choice;

            object[,] roomLocation = new object[,]
             {
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", "Z", " ", " ",  " ", " ", " ", " ", " ", " ", " ","|"},
                {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},               
                
             };
            ConsoleKeyInfo keyInfo;
            do
            {                
                Console.WriteLine("X-------------------------------X");
                Console.WriteLine("| Player " + character);
                Console.WriteLine("|-------------------------------X");
                Console.WriteLine("| Player Location: Bedroom");
                Console.WriteLine("|-------------------------------X");
                Console.WriteLine("| Health: " + playerOne.health + "|  Armor: " + playerOne.armor);                
                Console.WriteLine("| Coins: " + playerOne.coins + "|  Potion: " + playerOne.potions);
                Console.WriteLine("X-------------------------------X");
                Console.WriteLine(MovementLibrary.StandarsMoveMessages.MovementMenu());

                Console.WriteLine(" ");
                Console.Write("Make a selection -->");
                Console.WriteLine(" ");
                Console.WriteLine("Dungeon Map:");
                Console.WriteLine("================================================");
                for (int x = 0; x <= 9; x++)
                {
                    for (int y = 0; y <= 20; y++)
                    {
                        Console.Write(roomLocation[x, y]);
                    }
                    Console.WriteLine();
                }
                Console.WriteLine("================================================");

                //choice = Console.ReadLine();
                keyInfo = Console.ReadKey(true);
                Console.Clear();
                switch (keyInfo.Key)
                {

                    case ConsoleKey.UpArrow:
                        roomLocation[roomNum, num2] = " ";
                        if (roomNum > 0 && num2 >= 0)
                        {
                            roomNum--;
                            Console.WriteLine("Current Location: " + roomLocation[roomNum, num2]);
                            
                            roomLocation[roomNum, num2] = "X";
                            Console.WriteLine(roomLocation);
                        }
                        else if (roomNum == 1 && num2 > 0)
                        {
                            Console.WriteLine("You went to far");
                            Console.WriteLine("Current Location: " + roomLocation[roomNum, num2]);
                            roomLocation[roomNum, num2] = "X";
                        }
                        break;

                    case ConsoleKey.DownArrow:
                        roomLocation[roomNum, num2] = " ";
                        if (roomNum >= 0 && num2 >= 0)
                        {
                            if (roomNum == 9 && num2 >= 0)
                            {
                                Console.WriteLine("You went to far!");
                                Console.WriteLine("Current Location: " + roomLocation[roomNum, num2]);
                                roomLocation[roomNum, num2] = "X";
                            }
                            else if (roomNum >= 0 && num2 >= 0)
                            {
                                roomNum++;
                                Console.WriteLine("You are in the: " + roomLocation[roomNum, num2]);
                                Console.WriteLine("Keep going");
                                roomLocation[roomNum, num2] = "X";
                            }

                        }
                        break;


                    case ConsoleKey.RightArrow:
                        roomLocation[roomNum, num2] = " ";
                        if (roomNum >= 0 && num2 >= 0)
                        {
                            if (roomNum >= 0 && num2 == 19)
                            {
                                Console.WriteLine("You went to far!");
                                Console.WriteLine("Current Location: " + roomLocation[roomNum, num2]);
                                roomLocation[roomNum, num2] = "X";
                            }

                            else if (roomNum >= 0 && num2 >= 0)
                            {
                                num2++;
                                Console.WriteLine("You are in the: " + roomLocation[roomNum, num2]);
                                //Console.WriteLine("Keep going");
                                roomLocation[roomNum, num2] = "X";
                            }

                        }
                        break;
                    case ConsoleKey.LeftArrow:
                        roomLocation[roomNum, num2] = " ";
                        if (roomNum >= 0 && num2 > 0)
                        {
                            num2--;
                            Console.WriteLine("You are in the: " + roomLocation[roomNum, num2]);
                            Console.WriteLine("Keep going");
                            roomLocation[roomNum, num2] = "X";
                        }
                        else if (roomNum <= 0 && num2 <= 0)
                        {
                            Console.WriteLine("To far" + roomLocation[roomNum, num2]);
                            roomLocation[roomNum, num2] = "X";
                            roomLocation[roomNum, num2] = "X";
                        }
                        break;                   

                }
                

                if (roomNum == 8 && num2 == 10)
                {
                    Scenario.H1N1AttackScenario();

                }

                Console.Clear();
                if (roomNum == 0 && num2 == 4)
                {
                    int retrievedHealthPackage = 0;

                    if (retrievedHealthPackage > 0)
                    {
                        Console.WriteLine("You already retrieved the health package!");
                    }
                    else if (playerOne.health < 100)
                    {
                        playerOne.health = playerOne.health + 25;
                        retrievedHealthPackage += 25;
                    }
                    else if (playerOne.health <= 100)
                    {

                    }
                }

            } while (loop == false);

        }

    }
}
