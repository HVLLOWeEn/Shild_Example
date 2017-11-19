package example7_inheritance;

import java.lang.*;

/**
 * Created by hvllowe3n on 4/13/17.
 */
public class Shapes4 {
    public static void main(String[] args){
        TwoDShape[] shapes = new TwoDShape[5];  // массив обьектов
        shapes[0] = new Triangle("Контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10.0);
        shapes[2] = new Rectangle(10.0,4.0);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new Ellipse("Пустой", 12.4, 3.02);

        for(int i = 0; i < shapes.length; i++){
            System.out.println("Обьект: "
                    + shapes[i].getName());

            System.out.println("Площадь: "
                    + shapes[i].area());

            System.out.println();
        }
    }
}
