package example7_inheritance;

/**
 * Created by hvllowe3n on 4/11/17.
 */
class Shapes1 {
    public static void main(String[] args){
        Triangle ob = new Triangle();
        Triangle ob1 = new Triangle(10.6);
        Triangle ob2 = new Triangle("Пустой", 12.0,16.0);

        ob = ob1;

        System.out.println("Информация об ob: ");
        ob.showStyle();
        ob.showDim();
        System.out.println("Площадь: " + ob.area() + "\n");

        System.out.println("Информация о ob1: ");
        ob1.showStyle();
        ob1.showDim();
        System.out.println("Площадь: " + ob1.area() + "\n");

        System.out.println("Информация об ob2: ");
        ob2.showStyle();
        ob2.showDim();
        System.out.println("Площадь: " + ob2.area() + "\n");
    }
}
