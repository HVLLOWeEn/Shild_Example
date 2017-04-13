package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class ChangeStringD {
    public static void main(String[] args){
        String str = new String("Hello ");
        System.out.println(str);
        str = "World";
        System.out.println(str);


        String str1 = new String("World");
        str1 = str;
        System.out.println(str1 + " " + str);

        System.out.println( str1.substring(1, 4));

        StringBuffer st = new StringBuffer("String  ");       // Класс StringBuffer создает символьные
                                                                        // строки способные изменяться


    }
}
