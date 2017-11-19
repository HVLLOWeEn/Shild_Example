package example12_enum_annotation;
import static java.lang.Math.sqrt;      // статический импорт
import static java.lang.Math.pow;

// либо так: import static java.lang.Math.*;

public class QuadraticWithStaticImport {
    public static void main(String[] args) {
        // ax2 + bx + c = 0;
        double a, b, c, x;

        // Урвнение следующего типа: 4x2 + x - 3 = 0;
        a = 4;
        b = 1;
        c = -3;

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("x1: " + x);

        x = x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("x2: " + x);
    }
}
