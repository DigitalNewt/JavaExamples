/**
 * User: Brent Baker
 * Date: 2/7/15
 * Time: 6:17 PM
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAnimal {

    private final String canFly = "Flying High";
    private final String canNotFly = "I can't fly";


    @Test
    public void testPasses() {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        assertEquals(canNotFly, sparky.tryToFly());
        assertEquals(canFly, tweety.tryToFly());

        // This allows dynamic changes for flyingType
        sparky.setFlyingAbility(new ItFlys());
        assertEquals(canFly, sparky.tryToFly());
    }
}
