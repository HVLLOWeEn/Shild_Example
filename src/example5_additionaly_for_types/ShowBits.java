package example5_additionaly_for_types;

/**
 * Created by Roman on 26.03.2017.
 */
class ShowBits {
    public static void main(String[] args){
        int t;
        int value;
        value = 65;
        for(t=128; t > 0; t /=2){
            if((value &t) != 0) System.out.print("1");
            else System.out.print("0");
        }
       // int v = 8;
       // if(value & v) System.out.println("Четвертый бит числа " + value + " установлен");
        System.out.println();
        value = 97 & 65503;
        System.out.println(value + " " + (char)value);

    }
}
