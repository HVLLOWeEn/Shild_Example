package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */
public class Quardratic {
    public static void main(String[] args) {
        // ax2 + bx + c = 0;
        double a, b, c, x;

        // Урвнение следующего типа: 4x2 + x - 3 = 0;
        a = 4;
        b = 1;
        c = -3;

        // Первый корень:
        x = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        System.out.println("Первый корень: " + x);

        // Второй корень
        x = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        System.out.println("Второй корень: " + x);

    }
}
