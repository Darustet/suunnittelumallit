package Observer;
import java.util.Set;

import java.util.HashSet;

public abstract class Subject {
    Set<Observer> observers = new HashSet<>();

    public void attach(Observer o){
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    // Cannot override the final method from ObjectJava(67109265)
    // Cannot reduce the visibility of the inherited method from ObjectJava(67109273)
    /*
    protected void notify() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
    */
}
