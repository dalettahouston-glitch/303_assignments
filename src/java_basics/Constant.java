package java_basics;

public class Constant {

    public static void main (String[] args) {

        final int MINUTES_IN_HOUR = 60;

        int hours = 3;
        int totalMinutes = hours * MINUTES_IN_HOUR;

        System.out.println(totalMinutes);


    }
}
