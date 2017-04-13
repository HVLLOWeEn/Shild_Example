package example7_inheritance;

/**
 * Created by hvllowe3n on 4/12/17.
 */
public class Shapes3 {
    public static void main(String[] args){
        Triangle ob =
                new Triangle("Контурный", 8.0, 12.0);

        //TwoDShape ob3 = new Triangle();
        //Ссылочная переменная суперкласса
        //может ссылатся на обьект подкласса

        //Создать копию ob
        Triangle ob1 =
                new Triangle(ob);

        //информация ob
        System.out.println("Информация о ob: ");
        ob.showStyle();
        ob.showDim();
        System.out.println("Площадь: "
                + ob.area() + "\n");

        //информация ob1
        System.out.println("Информация o ob1: ");
        ob1.showStyle();
        ob1.showDim();
        System.out.println("Площадь: "
                + ob1.area());


    }
}
