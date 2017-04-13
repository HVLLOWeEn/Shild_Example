package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 06.04.2017.
 */
public class LocalClassDemo {
    public static void main(String[] args){
        // Внутренняя версия класса ShowBits
        class ShowBits{
            int numbits;

            ShowBits(int numbits){
                this.numbits = numbits;
            }
            void show(long val){
                long mask = 1;

                mask <<= numbits -1;

                int spacer = 0;
                for(; mask != 0; mask >>>= 1){
                    if((val & mask) !=0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if((spacer % 8) == 0){
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for(int i = 0; i < 10;i++){
            ShowBits ob = new ShowBits(8);
            System.out.print(i + " в двоичном представлении: ");
            ob.show(i);
        }
    }
}
