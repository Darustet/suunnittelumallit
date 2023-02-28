package observer;

import java.util.Observable;
import java.util.Scanner;

class EventSource extends Observable implements Runnable {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String response = scanner.next();
            setChanged();
            notifyObservers(response);
        }
    }
}
