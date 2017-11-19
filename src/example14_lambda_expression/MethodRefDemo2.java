package example14_lambda_expression;

public class MethodRefDemo2 {
   public static void main(String...args) {
       boolean result;
       MyIntNum myNum = new MyIntNum(12);
       MyIntNum myNum2 = new MyIntNum(16);

       IntPredicate ip = myNum::isFactor;       // Ссылка на метод экземпляра

       // Использовать ссылку для вызва метода isFactor();
       // через метод test()
       result = ip.test(3);
       if(result) System.out.println("3 является делителем: " + myNum.getNum());

       // Создать ссылку на метод экземпляра isFactor для обьекта myNum2
       // Использовать ссылку для вызва метода isFactor();
       // через метод test()

       IntPredicate ip2 = myNum2::isFactor;
       result = ip2.test(3);
       if(!result) System.out.println("3 не является делителем:" + myNum2.getNum());
   }
}
