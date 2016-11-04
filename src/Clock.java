import java.util.Observable;

/**
 * Created by Mitziu on 11/3/16.
 */
public class Clock extends Observable{

    public void tick() {
        this.setChanged();
        this.notifyObservers();
    }


}
