public class Balrog extends Creature
{
   private static final int MAX_BALROG_HP = 200;
   private static final int MIN_BALROG_HP = 80;
   private static final int MAX_BALROG_STR = 100;
   private static final int MIN_BALROG_STR = 50;

   public Balrog()
   {
      super(
         Randomizer.nextInt(MAX_BALROG_HP - MIN_BALROG_HP)+MIN_BALROG_HP,
         Randomizer.nextInt(MAX_BALROG_STR - MIN_BALROG_STR)+MIN_BALROG_STR
      );
   }

   public int damage()
   {
      return super.getStr() * 2;
   }

}
