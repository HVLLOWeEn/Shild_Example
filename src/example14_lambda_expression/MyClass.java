package example14_lambda_expression;


public class MyClass {
    static <T> boolean myGenMeth(T x, T y) {
        boolean result = false;
        //....
        return result;
    }
}
// Демонстрация ссылки на обобщенный метод
class MyClassRelise {
    public static void main(String[] args) {
        SomeTest<Integer> mRef = MyClass::<Integer>myGenMeth;
    }
}
