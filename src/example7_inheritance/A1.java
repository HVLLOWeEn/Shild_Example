package example7_inheritance;

/**
 * Created by hvllowe3n on 4/12/17.
 */
class A1 {
    A1(){
        System.out.println("Конструктор класса A1");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("Конструктор класса B1");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("Конструктор класса C1");
    }
}
class OrderOfConstructions{
    public static void main(String[]args){
        C1 ob = new C1();
        A1 ob1 = new C1();
    }
}
