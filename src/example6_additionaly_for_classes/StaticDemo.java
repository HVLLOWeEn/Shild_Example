package example6_additionaly_for_classes;

public class StaticDemo {
    int x;
    static int y;

    int sum(){
        return x + y;
    }
}
class SDemo{
    public static void main(String []args){
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        s1.x = 10;
        s2.x = 20;
        System.out.println("Разумееться s1.x and s2.x " +
                "независимы");
        System.out.println("s1.x: " + s1.x +
                            "\ns2.x: " + s2.x);
        //Все обьекты используют совместно общую переменную типа static
        System.out.println("Статическая переменная y - общая: ");
        StaticDemo.y = 19;
        System.out.println("Пpиcвoить StaticDemo.y значение 19");

        System.out.println("s1.sum(): "+ s1.sum());
        System.out.println("s2.sum(): " +s2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Сменить значение StaticDemo.y на 100");

        System.out.println("s1.sum(): "+ s1.sum());
        System.out.println("s2.sum(): " +s2.sum());
    }
}
