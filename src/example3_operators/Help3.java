package example3_operators;

/**
 * Created by hvllowe3n on 3/7/17.
 */
public class Help3 {
    public static void main(String [] args)throws java.io.IOException{
                char choise, ignore;
                for(;;) {
                    do {
                        System.out.println("Справка: ");
                        System.out.println("1) Оператор if...");
                        System.out.println("2) Оператор switch...");
                        System.out.println("3) Оператор For...");
                        System.out.println("4) Оператор While...");
                        System.out.println("5) Оператор do-while...");
                        System.out.println("6) Оператор break...");
                        System.out.println("7) оператор continue... \n");
                        System.out.println("Выберите: (q - выход)");
                        choise = (char) System.in.read();

                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');
                    } while (choise < '1' | choise > '7' & choise != 'q');

                    if(choise == 'q') break;
                    System.out.println("\n");


                    switch (choise) {
                        case '1': {
                            System.out.println("Оператор if...\n");
                            System.out.println("if(Условие) оператор");
                            System.out.println("else оператор");
                            break;
                        }
                        case '2': {
                            System.out.println("Оператор switch...\n");
                            System.out.println("Switch(Выражение)");
                            System.out.println("case константа: {");
                            System.out.println("оператор");
                            System.out.println("break;");
                            System.out.println("//...");
                            System.out.println("}");
                            break;
                        }
                        case '3': {
                            System.out.println("Оператор For...");
                            System.out.println("For(инициализация; условие; итерация)");
                            System.out.println("{ оператор; }");
                            break;
                        }
                        case '4': {
                            System.out.println("Оператор While...");
                            System.out.println("while(условие)");
                            System.out.println("{ оператор; ");
                            System.out.println("итерация;");
                            System.out.println("}");
                            break;
                        }
                        case '5': {
                            System.out.println("Оператор do while...");
                            System.out.println("do {");
                            System.out.println("оператор; ");
                            System.out.println("итерация; ");
                            System.out.println("} while(условие);");
                            break;
                        }
                        case '6':{
                            System.out.println("Оператор break...");
                            System.out.println("break; или break метка;");
                            break;
                        }
                        case '7':{
                            System.out.println("Оператор continue...");
                            System.out.println("continue; или continue метка;");
                            break;
                        }
                        default: {
                            System.out.println("Данного пункта меню нет!");
                        }
                 }
                    System.out.println("\t");
        }
    }
}
