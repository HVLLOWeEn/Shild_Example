package example3_operators;

/**
 * Created by HVLLO on 22.02.2017.
 */
public class Help {
    public static void main(String[] args)
            throws java.io.IOException{
            char choise;
            System.out.println("Справка: ");
            System.out.println("1) Оператор if...");
            System.out.println("2) Оператор switch...");
            System.out.println("Выберите: ");
            choise = (char)System.in.read();

            switch(choise){
                case '1':{
                    System.out.println("Оператор if...\n");
                    System.out.println("if(Условие) оператор");
                    System.out.println("else оператор");
                    break;
                }
                case '2':{
                    System.out.println("Оператор switch...\n");
                    System.out.println("Switch(Выражение)");
                    System.out.println("case константа: {");
                    System.out.println("оператор");
                    System.out.println("break;");
                    System.out.println("//...");
                    System.out.println("}");
                    break;
                }
                default:{
                    System.out.println("Данного пункта меню нет!");
                }
            }
    }
}
