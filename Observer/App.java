package observer;

import java.util.Observer;

class App {
    public static void main(String[] args) {

        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);

        System.out.println("Kello: ");

        EventSource eventSource = new EventSource();
        // Return type for the method is missingJava(16777327)
        // Observable cannot be resolved to a typeJava(16777218)
        eventSource.addObserver(new Observer(){ 
            update(Observable obj, Object arg) {
                System.out.println("\nReceived response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}
