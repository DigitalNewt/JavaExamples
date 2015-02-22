/**
 * User: Brent Baker
 * Date: 10/22/13
 * Time: 2:23 PM
 */
public class UFOBossEnemyShipFactory implements EnemyShipFactory{

    /**
     * Defines the weapon object to associate with the ship
     * @return ESUFOBossGun
     */
    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }

    /**
     * Defines the engine object to associate with the ship
     * @return ESUFOBossEngine
     */
    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO
    }

}
