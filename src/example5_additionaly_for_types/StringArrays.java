package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class StringArrays {
    public static void main(String[] args){
        System.out.println("Массивы строк ");
        String[] str = {"Hello", "Me", "Lol", "Kek", "World"};
        for (String x:
             str) {
            System.out.print(x + " ");
        }
        str[1] = "Kek";
        str[3] = "me";
        System.out.println("\n");
        System.out.println("Измененный массив: ");
        for (String x:
             str) {
            System.out.print(x + " ");
        }


    }
}
