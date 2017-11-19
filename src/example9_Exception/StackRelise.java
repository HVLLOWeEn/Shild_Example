package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public class StackRelise {
    public static void main(String[] args) {
        StackDemo objStack = new StackDemo(5);
        int number = 0;

        try {
            for(int i = 0; i < 5; i++) {
                System.out.print("Попытка записать " + ((i + 1) * 128));
                objStack.put((i + 1) * 128);
                System.out.println(" - OK.");
            }
            System.out.println();
        } catch (StackFullException exc){
            System.out.println(exc.toString());
        }

        try {
            for(int i = 5; i > 0; i--) {
                number = objStack.get();
                System.out.print(number);
                System.out.println(" - ОК.");
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc.toString());
        }
    }
}
