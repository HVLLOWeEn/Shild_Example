package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class GenIfDemo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4};
        MyClass<Integer> iOb = new MyClass<Integer>(arr);

        if(iOb.contains(2))
            System.out.println("2 содержится в iOb");
        else System.out.println("2 НЕ содержится в iOb");

        if(iOb.contains(5))
            System.out.println("5 содержится в iOb");
        else System.out.println("5 НЕ содержится в iOb");

    }
}
