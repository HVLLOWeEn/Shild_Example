package example5_additionaly_for_types;

/**
 * Created by Roman on 26.03.2017.
 */
class Bits {
    public static void main(String[] args){
        char ch;
        char ch1 = 'a';
        System.out.println((int)ch1);
        ch1 = 'A';
        System.out.println((int)ch1);
        for(int i = 0; i < 10;i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char)((int)ch & 65503);
            System.out.print(ch + " ");
        }
    }
}
