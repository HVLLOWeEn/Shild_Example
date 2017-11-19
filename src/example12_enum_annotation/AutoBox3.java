package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */

// Автоупаковка и автораспаковка в выражениях
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 99;       // Автоупаковка

        ++iOb;      // Автораспаковался -> произвел выражение iOb = iOb + 1 -> автоупаковался
        System.out.println("После ++iOb: " + iOb);

        iOb += 10; // Аналогичная ситуация: Автораспаковался -> произвел выражение iOb = iOb + 10 -> автоупаковался
        System.out.println("После iOb += 10: " + iOb);

        // Выполняется автораспаковка обьекта iOb, вычисление, а результат упаковывается в обь. iOb
        iOb2 = iOb + (iOb/3);
        System.out.println("iOb2 после вычисления: " + iOb2);

        // Вычисляется тоже самое выражение, но повторная упаковка не выполняется
        i = iOb + (iOb / 3);
        System.out.println("i после вычисления выражения: " + i);

        iOb = 2;
        // Также идет автораспаковка:
        switch(iOb) {
            case 1: {
                System.out.println("Один");
                break;
            }
            case 2: {
                System.out.println("Два");
                break;
            }
            case 3: {
                System.out.println("Три");
                break;
            }
            default: {
                System.out.println("Error");
            }
        }
    }
}
