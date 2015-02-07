import java.util.ArrayList;
import java.util.List;

/**
 * User: Brent Baker
 * Date: 10/15/13
 * Time: 9:13 AM
 */
public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        // Creates an ArrayList to hold all observers
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        // Adds a new observer to the ArrayList
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);

        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        // Removes observer from the ArrayList
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of
        // price changes
        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }

}
