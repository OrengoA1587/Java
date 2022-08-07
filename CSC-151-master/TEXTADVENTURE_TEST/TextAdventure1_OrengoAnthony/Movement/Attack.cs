using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Movement
{
    public static class Attack
    {
        public static int combat()
        {
            Random rand = new Random();
            int counter = 100;
            int attack = rand.Next(1, 20);
            int damage = counter - attack;

            Console.WriteLine($"Attack Damage: {attack}");            
            
            Console.WriteLine(counter - attack); 

            return damage;


        }
       
    }
}
