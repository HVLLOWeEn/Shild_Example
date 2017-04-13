package example3_operators;

/**
 * Created by HVLLO on 24.02.2017.
 */
public class DoWhileDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        /*char ch;
        do{
            System.out.println("Press to char: ");
            ch = (char)System.in.read();
        }while(ch != 'q');
    }*/

        char ch1, ignore, ansver = 's';
        do {
            System.out.println("Была задумана буква алфавита от A - Z");
            System.out.print("Попытайтесь угадать ее:");
            ch1 = (char) System.in.read();
            do{
                ignore = (char)System.in.read();
            }while(ignore != '\n');
            if(ch1 ==  ansver){
                System.out.println("***** Правильно *****");
            }
            else if(ch1 != ansver){
                System.out.println("Ваша буква не верная!");
                System.out.print("Загаданая буква находиться: ");
                if(ch1 < ansver){
                    System.out.println("ближе к концу алфавита!");
                }
                else {
                    System.out.println("ближе к началу алфавита!");
                }
            }
            System.out.println();
        } while (ch1 != ansver);
    }
}