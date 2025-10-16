import java.util.ArrayList;
import java.util.List;

// Subject: Gerencia os observers e os notifica.
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) { observers.add(o); }
    public void detach(Observer o) { observers.remove(o); }

    public void notifyObservers(int value) {
        for (Observer o : observers) {
            o.update(value);
        }
    }
}
