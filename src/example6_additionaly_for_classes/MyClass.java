package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 02.04.2017.
 */
class MyClass {
    int x;
    MyClass(){
        System.out.println("Внутри MyClass().");
        x = 0;
    }
    MyClass(int i){
        System.out.println("Внутри MyClass(int i).");
        x = i;
    }
    MyClass(double d){
        System.out.println("Внутри MyClass(double d).");
        x = (int) d;
    }
    MyClass(int i, int j){
        System.out.println("Внутри MyClass(int, int).");
        x = i * j;
    }
}
class OverLoadDemo{
    public static void main(String[] args){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(1436.55);
        MyClass t4 = new MyClass(12,14);

        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        System.out.println(t4.x);
    }
}