/**
*
*@author Peter Basily
*@version 12/3/2018
**/

import java.util.ArrayList;
import java.util.Iterator;
public class CreatureWar
{

   private static ArrayList<Creature> theDire;
   private static ArrayList<Creature> theRadiant;
   private static final int MAX_HORDE_SIZE = 50;
   private static final int MAX_RADIANT_SIZE = 250;


   public static void main(String[] args)
   {
      //these are the sizes for the two armies created at random
      int dire = Randomizer.nextInt(MAX_HORDE_SIZE-20)+20;
      int radiant = Randomizer.nextInt(MAX_RADIANT_SIZE - 100)+100;

      //arraylist to hold the evil army
      theDire = new ArrayList<>();
      //arraylist to hold the good army
      theRadiant = new ArrayList<>();

      //list to fill out the evil army randomly
      for(int x = 0; x < dire; x++)
      {
         int foo = Randomizer.nextInt(100);

         if(foo < 5)
         {
            theDire.add(new Balrog());

         }
         else if(foo >= 5 && foo <= 75)
         {
            theDire.add(new Demon());
         }
         else if(foo >75)
         {
            theDire.add(new CyberDemon());
         }
      }
      //list to fill out the good army randomly
      for(int x = 0; x < radiant; x++)
      {
         int foo = Randomizer.nextInt(100);

         if(foo <= 25)
         {
            theRadiant.add(new Elf());

         }
         else if(foo > 25)
         {
            theRadiant.add(new Human());
         }

      }

      //iterator for evil army
      Iterator<Creature> army1 = theDire.iterator();
      //iterator for good army
      Iterator<Creature> army2 = theRadiant.iterator();
      //evil soldier currently fighting
      Creature direSoldier = theDire.get(0);
      //good soldier currently fighting
      Creature radiantSoldier = theRadiant.get(0);
      //if both armies have another soldier...
      while(army1.hasNext()&& army2.hasNext())
      {

         //do battle
         direSoldier.takeDamage(radiantSoldier.damage());
         radiantSoldier.takeDamage(direSoldier.damage());
         //advance soldiers if one is dead
         if(direSoldier.isDead())
            direSoldier = army1.next();
         if(radiantSoldier.isDead())
            radiantSoldier = army2.next();

         //if either army runs out of soldiers display the apropriate message
         if(!army1.hasNext())
         {

            System.out.println("The Dire army is defeated. Long live The Radiant!");


         }
         if(!army2.hasNext())
         {

            System.out.println("The Radiant army is defeated. Long live The Dire!");


         }

      }



   }

}
