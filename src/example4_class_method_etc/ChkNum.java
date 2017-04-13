package example4_class_method_etc;

/**
 * Created by hvllowe3n on 3/7/17.
 */
class ChkNum {
    // Вернуть лолическое значение True
    // если x содержит четное число
    boolean isEven(int x){          // Здесь int x - это целочисленный параметр метода isEven()
        if((x % 2) == 0){
            return true;
        }
        else return false;
    }
}
class ParmDemo{
     public static void main(String[] args){
         ChkNum bla = new ChkNum();
         if(bla.isEven(10)) System.out.println("10 - четное число");
         if(bla.isEven(9)) System.out.println("9 - четное число");
         if(bla.isEven(8)) System.out.println("8 - четное число");
     }
}
