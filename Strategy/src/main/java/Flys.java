/**
 * User: Brent Baker
 * Date: 10/23/13
 * Time: 11:28 AM
 */
public interface Flys {
    String fly();
}

// Class used if the Animal can fly
class ItFlys implements Flys{

    public String fly() {
        return "Flying High";
    }

}

//Class used if the Animal can't fly
class CantFly implements Flys{

    public String fly() {
        return "I can't fly";
    }

}
