/**
 * User: Brent Baker
 * Date: 10/22/13
 * Time: 3:30 PM
 * EnemyShip contains a reference to the object
 * ESWeapon. It is stored in the field weapon
 *
 * The Strategy design pattern is being used here
 */
public class ESUFOBossGun implements ESWeapon{

    /**
     * When the field that is of type ESUFOGun is printed
     * the following shows on the screen
     * @return String
     */
    public String toString(){
        return "40 damage";
    }

}