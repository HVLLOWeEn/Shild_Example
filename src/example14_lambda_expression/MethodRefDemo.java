package example14_lambda_expression;

public class MethodRefDemo {

    // В данном методе типом первого параметра является
    // фун-ый интерфейс, следовательно ему можно передать ссылку на любой
    // экземпляр этого интерфейса. В том числе и на экземпляр, созданный
    // посредством ссылки на метод
    public static boolean numTest(IntPredicate p, int n) {
        return p.test(n);
    }
    public static void main(String[] args) {
        boolean result;

        // Здесь методу numTest передается ссылка на метод isPrime()
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result) System.out.println("17 - простое число!");

        // Здесь методу numTest передается ссылка на метод isEven()
        result = numTest(MyIntPredicates::isEven, 16);
        if(result) System.out.println("16 - четное число!");

        // Здесь методу numTest передается ссылка на метод isPositive()
        result = numTest(MyIntPredicates::isPositive, 11);
        if(result) System.out.println("11 - положительное число!");
    }
}
