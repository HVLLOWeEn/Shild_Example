package example3_operators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class KbIn {
    public static void main(String[] args)
       throws java.io.IOException {     // Необходимо для использования System.in.read();
        char ch, ch1 = 'S';
        System.out.print("Игра угадывания слов\nЗадумана буква от A - Z\nУгадай букву: ");
        ch = (char) System.in.read();
            if (ch == ch1){
                System.out.println("Вы угадали букву: " + "\"" + ch1 + "\"");
            }
            else {
                System.out.print("Выш ответ не верный! Правильная буква находиться ближе к: ");
                if(ch < ch1)
                    System.out.println("началу алфавита!");
                else
                    System.out.println("концу алфавита!");
                }

    }
}