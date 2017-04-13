package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class SubStr {
    public static void main(String[] args){
        String orgstr =  "Java - вигатель интернета";
        String substr =  orgstr.substring(7, 25);

        System.out.println("Строка до: " + orgstr);
        System.out.println("Строка после: " + substr);
    }
}
