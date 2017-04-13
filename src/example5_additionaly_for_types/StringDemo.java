package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class StringDemo {
    public static void main(String[] args){
        String str = new String("В Java строки - объекты");
        String str1 = "Их можно создавать разными способами!";
        String str2 = new String(str1);
        String str3 = new String("Hello World Hello");
        String str4 = "Hello";
        String str5 = "В Java строки ефективны";


        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str2.equals(str1));      // equals метод сравнение. Возвращает true
                                                    // в случае полного совпадения символов в обоих случаях

        // String method()
        System.out.println(str3.length());
        System.out.println(str3.charAt(3));            // charAt() возв. по индексу символ в строке
        System.out.println(str3.compareTo(str2));
        System.out.println(str3.compareTo(str3));
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.indexOf(3));

        for(int i = 0; i < str3.length();i++)
            System.out.print(str3.charAt(i));           // Отображение строки по-символьно

        int index = str3.indexOf("Hello");
        System.out.println(index);

        String str6 = new String();
        str6 = str1 +str2+str3+str4+str5;       // Конкатенация строк
        System.out.println(str6);
    }
}
