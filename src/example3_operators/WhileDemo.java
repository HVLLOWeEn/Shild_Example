package example3_operators;

/**
 * Created by HVLLO on 23.02.2017.
 */
public class WhileDemo {
    public static void main(String[] args){
        char ch = 'A';
        while(ch != 'Z'){
            System.out.println(ch);
            ch++;
        }
        int e, result;
        for(int i = 0; i < 10; i++){
            result = 1;
            e = i;
            while(e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 в степени " + i + " = "
                    + result);
        }
    }
}
