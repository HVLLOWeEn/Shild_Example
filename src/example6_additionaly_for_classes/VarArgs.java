package example6_additionaly_for_classes;

/**
 * Created by hvllowe3n on 4/10/17.
 */
public class VarArgs {
    static void vaTest(int...v){
        System.out.println("Кол-во аргументов: " + v.length);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    static void vaTest(String msg, int...v){    // Перегрузка
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for(int i = 0; i < v.length;i++){
            System.out.println("args[" + i + "]: " + v[i]);
        }
        System.out.println();
    }

    /* static void ovVarTest(int a, double...v ,String msg, int...d){
        ...     // Не допустимая запись: * переменная длина аргументов всегда должна быть в конце
                                         * нельзя указывать в аргументы 2 или больше списка параметров переменной длины!
                                         * (для этого используй перегрузку!)
    }*/
    static void vaTest(boolean ... v){
        System.out.println(v.length);
        System.out.println("Блок boolean");
        System.out.println("Содержимое: ");

        for(int i = 0; i < v.length;i++){
            System.out.println("args[" + i + "]: " + v[i]);
        }
        System.out.println();
    }
}
class TestArgs{
    public static void main(String[]args){
        VarArgs.vaTest(10);
        VarArgs.vaTest(3,34,432);
        VarArgs.vaTest(1);
        VarArgs.vaTest("None");

        VarArgs.vaTest("Один аргумент: ", 10);
        VarArgs.vaTest("Три аргумента: ", 1, 2, 3);

        VarArgs.vaTest(true, false, false);
    }
}
