package example7_inheritance;

/**
 * Created by hvllowe3n on 4/11/17.
 */
public class Shapes2 {
    public static void main(String[] args){
        ColorTriangle obColor = new ColorTriangle("Черный", "тупой", 8.0,10.2);
        ColorTriangle obColor1 = new ColorTriangle("Серо-буро-малновый", "контурный", 4.0,4.0);

        System.out.println("Информация obColor: ");
        obColor.showDim();
        obColor.showColor();
        obColor.showStyle();
        System.out.println("Площадь: " + obColor.area() + "\n");

        System.out.println("Информация obColor1: ");
        obColor1.showDim();
        obColor1.showColor();
        obColor1.showStyle();
        System.out.println("Площадь: " + obColor1.area()+ "\n");
    }
}
