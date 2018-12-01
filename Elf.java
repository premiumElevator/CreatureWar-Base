

/**
 * Write a description of class Elf here.
 *
 * @author Peter Basily
 * @version 2018.11.25
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 10;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );

    }

    public int damage()
    {
      int dmg = (Randomizer.nextInt(super.getStr() - 1) + 1);
      int d = Randomizer.nextInt(100-1)+1;

      if(d < 10)
        dmg = dmg * 2;

      return dmg;
    }

}
