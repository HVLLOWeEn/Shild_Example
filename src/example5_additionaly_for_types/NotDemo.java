package example5_additionaly_for_types;

/**
 * Created by Roman on 27.03.2017.
 */
class NotDemo {
    public static void main(String[] args){
        byte b = -34;

        for(int i = 128; i > 0; i/=2){
            if((b & i) != 0) System.out.print("1");
            else System.out.print("0");
        }
        // обратить состояние битов
        b = (byte) ~b;
        System.out.println();
        System.out.println(b);
        for(int i = 128; i > 0; i/= 2){
            if((b & i) != 0) System.out.print("1");
            else System.out.print("0");
        }
    }
}
