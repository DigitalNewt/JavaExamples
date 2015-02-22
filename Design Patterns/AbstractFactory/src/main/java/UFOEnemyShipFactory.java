/**
 * User: Brent Baker
 * Date: 10/22/13
 * Time: 2:22 PM
 */
public class UFOEnemyShipFactory implements EnemyShipFactory{

    /**
     * Defines the weapon object to associate with the ship
     * @return ESUFOGun
     */
    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    /**
     * Defines the engine object to associate with the ship
     * @return ESUFOEngine
     */
    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }
}