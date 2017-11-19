package example6_additionaly_for_classes;

/**
 * Created by hvllowe3n on 4/10/17.
 */
public class CharRecursion {
    private String msg;
    CharRecursion(String s){
        msg = s;
    }

    void recCh(int idx){
        if(idx != msg.length() - 1) {
            System.out.println(msg.charAt(idx));
            recCh(idx + 1);
        }
        System.out.print(msg.charAt(idx));
    }
}
class DemoRecChar{
    public static void main(String[] args){
        CharRecursion ob = new CharRecursion("This is a text...");

        System.out.println("Исходная строка...");
        System.out.println("This is a text...");

        ob.recCh(0);
    }
}
