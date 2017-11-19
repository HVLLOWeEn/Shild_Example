package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */
public class Wrap {
    public static void main(String []args) {
        // Упаковка и распаковка значений вручную
        Integer iOb = new Integer(100);     // Упаковка вручную

        int i = iOb.intValue();     // распоковка значения 100 из обьекта iOb вручную

        System.out.println(i + ", " + iOb);
    }
}
