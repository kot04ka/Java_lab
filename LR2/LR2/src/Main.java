import java.util.Random;

public class Main {

    public static void main(String[] args) {
        short s1 = 99;
        short s2 = 99;
        float f1 = 0.0f;
        float f2 = 0.0f;
        byte b = -10;
        boolean q = true;
        Random random = new Random();

        s1 = (short) Math.pow(b, 2);

        s2 = (short) random.nextInt(11);

        int d2 = random.nextInt(9999 - 1 + 1) + 1;

        int d1 = 0;
        if (s1 != 0 && s2 != 0) {
            d1 = d2 / (s1 * s2);
        }

        System.out.println("s1 (b^2): " + s1);
        System.out.println("s2 (random between 0 and 10): " + s2);
        System.out.println("d2 (random between 1 and 9999): " + d2);
        System.out.println("d1 (d2 / (s1 * s2)): " + d1);

        if (s1 != 0) {
            double y = Math.tan(Math.pow(f1, s2)) / Math.log(s1);
            System.out.println("y = tan(f1^s2) / log(s1): " + y);
        } else {
            System.out.println("Cannot calculate y because s1 is zero.");
        }
    }
}
