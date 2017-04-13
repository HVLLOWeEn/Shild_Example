package example4_class_method_etc;

/**
 * Created by hvllowe3n on 3/8/17.
 */
class MyClass {
    int x;
    // Пустой конструктор
    MyClass(){
        x = 10;
    }
}
class ConsDemo{
    public static void main(String [] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass();
        System.out.println(myClass.x + " " + myClass1.x);
    }

}
