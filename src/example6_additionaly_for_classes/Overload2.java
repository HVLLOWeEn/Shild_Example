package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 02.04.2017.
 */
class Overload2 {
    void f(int x){
        System.out.println("Внутри ф-ции f(int): " + x);
    }
    void f(double x){
        System.out.println("Внутри ф-ции f(double): " + x);
    }

}
class Ovl{
    public static void main(String[] args){
        Overload2 ob = new Overload2();

        int i = 123;
        double d = 23.32;
        float f = 12.3f;
        byte b = 127;

        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(f);
    }
}
