package example13_generalizations;


/**
 * Created by romansynovets on 6/17/17.
 */

// Демонстрация использования обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку на обьект типа Gen<Integer>
        Gen<Integer> iOb;

        // Создать обьект типа Gen<Integer> и присвоить ссылку на
        // него переменной iOb. Внимание на автоупаковку при
        // инкапсуляции значения 88 в обьекте типа Integer.
        iOb = new Gen<Integer>(88);         // Создание экземпляра типа Gen<Integer>    // здесь же и происходит автоупаковка

        // Равнозначная запись
        // iOb = new Gen<Integer>(new Integer(88));
        // но грамоздко

        int v = iOb.getob();            // автораспаковка и передача значения из T(Integer) getob();
        System.out.println("Значение: " + v);

        // Отобразить тип данных, использеумый в обьекте iOb
        iOb.showType();

        System.out.println();

        Gen<String> iOb1;
        iOb1 = new Gen<String>("Generic test");
        String s = iOb1.getob();
        System.out.println("Значение: " + s);

    }
}
