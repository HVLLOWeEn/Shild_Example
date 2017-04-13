package example5_additionaly_for_types;

/**
 * Created by Roman on 27.03.2017.
 */
class MoveToBit {
   public static void main(String[] args){
        int val = 1;
        for(int i = 0; i < 8;i++){
            for(int j = 128; j > 0; j/= 2){
                if((val & j) != 0)System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
            val = val << 1;      // Сдвиг в лево
        }
        System.out.println();
        val = 128;
        for(int i = 0; i < 8;i++){
            for(int j = 128; j > 0; j/= 2){
                if((val & j) != 0)System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
            val = val >> 1;      // Сдвиг в право
        }
        System.out.println();
    }
}
