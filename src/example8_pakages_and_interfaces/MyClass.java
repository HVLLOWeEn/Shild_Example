package example8_pakages_and_interfaces;

/**
 * Created by HVLLO on 25.04.2017.
 */

// Если есть наследование интерфейсов, реализация методов необходима по
// всей цепочке.
// В этом классе должны быть реализованы интерфейсы A и B
public class MyClass implements B {

    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1()");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2()");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3()");
    }
}
class IFExtends{
    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
        myClass.meth3();
    }
}
