class Time {
    int hours = 24;
}

class Minute extends Time {
    int toMinutes() {
        return hours * 60; 
    }
}

class Second extends Time {
    int toSeconds() {
        return hours * 3600; 
    }
}

public class TimeConverter {
    public static void main(String[] args) {
        Minute min = new Minute();
        Second sec = new Second();

        System.out.println("Hours: " + min.hours);
        System.out.println("Minutes: " + min.toMinutes());
        System.out.println("Seconds: " + sec.toSeconds());
    }
}
