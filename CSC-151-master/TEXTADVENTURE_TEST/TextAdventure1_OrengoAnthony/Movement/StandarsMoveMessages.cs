using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MovementLibrary
{
    public static class StandarsMoveMessages
    {
        public static string MovementMenu()        {

            //Allows unicode to display in console.
            Console.OutputEncoding = System.Text.Encoding.Unicode;

            //returns movement menu
            return " \u2191 Move North   \u2193 Move South" +
                  "\n \u2192 Move East    \u2190 Move West";

        }

        public static string AttackMenu()
        {
            return "-------------------------\n" +
                   "|      Attack menu      |\n" +
                   "-------------------------\n" +
                   "|1. Attack     2.Scream |\n" +
                   "|3. Potion     4.Weapons|\n" +
                   "-------------------------\n" +
                   "Make a selection -->";
           
        }
                       
        

    }
}
