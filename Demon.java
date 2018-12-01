public class Demon extends Creature
{
  private static final int MAX_DEMON_HP = 80;
  private static final int MAX_DEMON_STR = 30;
  private static final int MIN_DEMON_HP = 20;
  private static final int MIN_DEMON_STR = 15;

  public Demon()
  {
      super(
        Randomizer.nextInt(MAX_DEMON_HP - MIN_DEMON_HP)+MIN_DEMON_HP,
        Randomizer.nextInt(MAX_DEMON_STR - MIN_DEMON_STR)+MIN_DEMON_STR);

  }

  public Demon(int hp, int str)
  {
     super(hp, str);
  }

  public int damage()
  {
    int dmg = Randomizer.nextInt(super.getStr() - 1) + 1;
    int d =Randomizer.nextInt(100);

    if(d < 5)
      dmg += 50;

    return dmg;
  }

}
