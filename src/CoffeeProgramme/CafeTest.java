package CoffeeProgramme;

/**
 * Created by student on 26/08/2016.
 */
import org.junit.*;


public class CafeTest {

    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;
    public static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();

    private Cafe cafe;
    //tests HAVE to be annotated or it doesn't register as test
    @Before
    public void before() {
        cafe = new Cafe();
    }

    @Test
    public void canBrewEspresso() {
        //Given - what is given
        withBeans();
        //WHEN - what is happening
        Coffee coffee = cafe.brew(CoffeeType.Espresso);
        //THEN - what is the result of what is happening
        //1 - is it an expresso
        Assert.assertEquals("Wrong coffee type", CoffeeType.Espresso, coffee.getType());

    }

    public void withBeans() {
        cafe.restockBeans(ESPRESSO_BEANS);
    }
}
