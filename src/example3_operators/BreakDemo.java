package example3_operators;

/**
 * Created by HVLLO on 25.02.2017.
 */
public class BreakDemo {
    public static void main(String[] args){
        for(int i = 0; ; i++){
            System.out.println(i);
            if( i == 100) {
                break;
            }
        }
    }
}
