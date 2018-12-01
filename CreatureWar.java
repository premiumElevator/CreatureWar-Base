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
      int dire = Randomizer.nextInt(MAX_HORDE_SIZE-20)+20;
      int radiant = Randomizer.nextInt(MAX_RADIANT_SIZE - 100)+100;


      theDire = new ArrayList<>();
      theRadiant = new ArrayList<>();

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


      Iterator<Creature> army1 = theDire.iterator();
      Iterator<Creature> army2 = theRadiant.iterator();
      Creature direSoldier = theDire.get(0);
      Creature radiantSoldier = theRadiant.get(0);

      while(army1.hasNext()&& army2.hasNext())
      {


         direSoldier.takeDamage(radiantSoldier.damage());
         radiantSoldier.takeDamage(direSoldier.damage());

         if(direSoldier.isDead())
         direSoldier = army1.next();
         if(radiantSoldier.isDead())
         radiantSoldier = army2.next();

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
