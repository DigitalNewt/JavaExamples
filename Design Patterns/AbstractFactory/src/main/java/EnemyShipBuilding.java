/**
 * User: Brent Baker
 * Date: 10/22/13
 * Time: 2:01 PM
 * This acts as an ordering mechanism for creating
 * EnemyShips that have a weapon, engine & name
 * & nothing else
 */
public abstract class EnemyShipBuilding {

    /**
     * The specific parts used for engine & weapon depend
     * upon the String that is passed to this method
     * @param typeOfShip Type of Ship
     * @return String
     */
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    /**
     * When called a new EnemyShip is made. The specific parts
     * are based on the String entered. After the ship is made
     * we execute multiple methods in the EnemyShip Object
     * @param typeOfShip Type of Ship
     * @return EnemyShip
     */
    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        if (theEnemyShip != null) {
            theEnemyShip.makeShip();
            theEnemyShip.displayEnemyShip();
            theEnemyShip.followHeroShip();
            theEnemyShip.enemyShipShoots();
        }

        return theEnemyShip;
    }
}
