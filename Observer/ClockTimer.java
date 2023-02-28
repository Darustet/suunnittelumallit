package observer;

public class ClockTimer extends Subject {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    void tick() {
        if ((second == 59)) {
            second = 0;
            minute++;
        } else {
            second++;
        } 
        if ((minute == 60 && second == 0)) {
            minute = 0;
            hour++;
        } 
        if (hour == 24 && minute == 0 && second == 0) {
            hour = 0;
        }
        notify();
    }
    
}
