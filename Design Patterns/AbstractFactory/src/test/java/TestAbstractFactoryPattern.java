import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * User: Brent Baker
 * Date: 2/16/15
 * Time: 8:31 PM
 */
public class TestAbstractFactoryPattern {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public  void testEnemyShip() {
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        assertEquals("Making enemy ship UFO Grunt Ship\nUFO Grunt Ship is on the screen\n" +
        "UFO Grunt Ship is following the hero at 1000 mph\nUFO Grunt Ship attacks and does 20 damage", outContent.toString().trim());
        assertEquals("The UFO Grunt Ship has a top speed of 1000 mph and an attack power of 20 damage", theGrunt.toString());

        outContent.reset();
        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        assertEquals("Making enemy ship UFO Boss Ship\nUFO Boss Ship is on the screen\n" +
                "UFO Boss Ship is following the hero at 2000 mph\nUFO Boss Ship attacks and does 40 damage", outContent.toString().trim());
        assertEquals("The UFO Boss Ship has a top speed of 2000 mph and an attack power of 40 damage", theBoss.toString());

        EnemyShip theTardus = MakeUFOs.orderTheShip("Tardus");
        assertNull(theTardus);
    }
}
