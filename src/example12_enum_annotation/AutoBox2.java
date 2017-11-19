package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */
public class AutoBox2 {
    public static void m(Integer v) {      // получил Integer
        System.out.println("m() -> получил: " + v);
    }
    public static int m2() {       // Возвр. int
        return 10;
    }
    public static Integer m3() {
        return 99;          // автоупаковка значения 99 в обьект типа Integer
    }

    public static void main(String[] args) {
        m(199);     // передается int ->  m() принимает Integer -> происходит автоупаковка

        Integer iOb = m2();     // Объект iOb получает значение int от m2() -> автомат упаковываеться для обьекта iOb
        System.out.println("Значение, возвращаемое методом m2(): " + iOb);

        int i = m3();       // m3() возвращает значение типа Integer ->  автоматически распаковывается и преобразуется в тип int
        System.out.println("Значение, возвращаемое методом m3(): " + i);

        // Методу Math.sqrt(); в качестве параметра передаеться
        // обьект iOb, который автом распаковывается, а его
        // значение повышается до типа double, требующий для
        // выполнения данного метода

        iOb = 100;
        System.out.println("SQRT with Object iOb: " + Math.sqrt(iOb));
    }
}
