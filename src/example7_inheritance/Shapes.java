package example7_inheritance;

//Наследование обоспечивает создание иерархических классификаций
class Shapes {
    public static void main(String[] args){
        Triangle ob = new Triangle("Закрашенный ", 4.0,4.0);
        Triangle ob1 = new Triangle("Пустой ", 8.0, 12.0);
        Square ob2 = new Square("Контурный ", 6.0, 6.0);
        Rectangle ob3 = new Rectangle(8.1, 8.5);


        /*Инициализация первых 2-х версий классов
        //для использования удалить все конструкторы в подклассах
        // Трехугольник 1
        ob.setWidth(4.0);
        ob.setHeight(4.0);
        ob.setStyle("Закрашенный");

        // Трехугольник 2
        ob1.setWidth(8.0);
        ob1.setHeight(12.0);
        ob1.setStyle("Контурный");

        // Квадрат
        ob2.setWidth(6.0);
        ob2.setHeight(6.0);
        ob2.setStyle("Прозрачный");

        // Прямоугольник
        ob3.setWidth(8.0);
        ob3.setHeight(8.0);
        */

        System.out.println("Информация об ob:");
        ob.showDim();
        ob.showStyle();
        System.out.println("Площадь ob: " + ob.area()
                + "\n");

        System.out.println("Информация об ob1:");
        ob1.showDim();
        ob1.showStyle();
        System.out.println("Площадь ob1: " + ob1.area()
                + "\n");

        System.out.println("Информация об ob2:");
        ob2.showDim();
        ob2.showStyle();
        System.out.println("Площадь ob2: " + ob2.area() + "\n");

        ob3.showDim();
        //System.out.println("Сходимость: " + ob3.isSquare());
        System.out.println("Area ... ob3: " + ob3.area());

    }
}
