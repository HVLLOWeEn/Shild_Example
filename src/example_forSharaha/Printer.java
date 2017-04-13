package example_forSharaha;


/**
 * Created by HVLLO on 02.03.2017.
 */
public class Printer {

    public static void print(String value) {
        System.out.println(value);
    }
    public static void main(String [] args){
        System.out.print("\033[31mERROR ");
    }

}
