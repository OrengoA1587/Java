using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUI
{
    class SplashScreen
    {

        public static void Splash()
        {

            //Displays Main menu welcome screen for Zombie Adventure
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
        }

        public static void EndMessage()
        {
            Console.WriteLine("Not Everyone is meant to win Zombie Adventure.");
            Console.WriteLine("You have proven to be a failure because you lack");
            Console.WriteLine("the neccessary skills of surviving. Better luck");
            Console.WriteLine("next time loser.");
            Console.WriteLine(" ");
            Console.WriteLine(" ");
            Console.WriteLine("Developer Credits");
            Console.WriteLine("***********************************************.");
            Console.WriteLine("Press enter to exit");
            Console.ReadLine();
            System.Environment.Exit(0);
        }
        
    }
}
