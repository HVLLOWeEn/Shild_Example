package example4_class_method_etc;

/**
 * Created by hvllowe3n on 3/9/17.
 */

// Параметризированный конструктор

class MyClass1 {
    int x;
    String s;
    MyClass1(int _varible, String str){
        x = _varible; s = str;
    }

}

class ParamConsDemo{
    public static void main(String[] args){
        MyClass1 cLass1 = new MyClass1(10, "Hello macOS");
        MyClass1 class2 = new MyClass1(11, "Android and iOS Forever");
        System.out.println(cLass1.x + " " + cLass1.s);
        System.out.println(class2.x + " " + class2.s);
    }

}