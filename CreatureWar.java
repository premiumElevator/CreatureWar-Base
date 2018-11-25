import java.util.ArrayList;
public class CreatureWar
{

   private static ArrayList<Creature> theDire;
   private static ArrayList<Creature> theRadiant;
   private static final int MAX_HORDE_SIZE = 50;
   private static final int MAX_RADIANT_SIZE = 200;
   private static final int MAX_BALROGS = 5;
   public static void main(String[] args)
   {
      int dire = Randomizer.nextInt(MAX_HORDE_SIZE-10)+10;
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
         else if(foo >76)
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
      

   }
}
