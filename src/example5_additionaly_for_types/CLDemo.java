package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class CLDemo {
    public static void main(String[] args){
        System.out.println("Програма демонстрирующая сколько " +
                "аргументов передано командной строке");
        String str = "Hello";
        System.out.println(str);

        for(int i =0; i < args.length; i++){
            System.out.println("Командной строке передано: ["+ args[i] + "] аргументов.");
        }
    }
}
