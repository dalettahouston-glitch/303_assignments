package java_basics;

public class IntDivision {

    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        double q = y / x;

        System.out.println("q using interger division: " + q);

        q = (double) y / x;

        System.out.println("q after casting y to double:  " + q);

    }

}


