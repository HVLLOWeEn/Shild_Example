package example14_lambda_expression;

public class LambdaExceptionDemo {
   public static void main(String[] args) {
       double []values = {1.0, 2.0, 3.0, 4.0};

       // Данное блочное лябмда-выражение может генерировать
       // исключние IOException. Следовательно, это исключение
       // должно быть указано в операторе throws метода ioAction()
       // функционального интерфейса MyAction
       MyIOAction myIO =(rdr) -> {
           int ch = rdr.read();       //Может генерировать исключение IOException
           return true;
       };
   }
}
