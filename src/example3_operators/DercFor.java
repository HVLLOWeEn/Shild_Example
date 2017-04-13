package example3_operators;

/**
 * Created by HVLLO on 22.02.2017.
 */
public class DercFor {
    public static void main(String[] args)
    throws java.io.IOException{
        for(int i = 100; i > -100; i-=5){
            System.out.println(i);
        }
        for(int i = 0 ,j = 10; i < j; i++ ,j--){
            System.out.println("i and j: " + i + " , " + j);
        }
        char ch;
        for(int i = 0;(char)System.in.read() != 'S';i++){
            System.out.println("Проход #" + i);
        }
        //int i = 0;
        //for(; i < 10; ){
          //  System.out.println(i);
            //i++;
        //}
        int sum = 0;
        for(int i = 1; i <= 5;sum += i++);
        System.out.println("Sum = " + sum);

        //for(;;){
          //  System.out.println("!!!!");
        //}
    }
}
