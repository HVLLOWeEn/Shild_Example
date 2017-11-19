import java.util.ArrayList;
import java.util.List;

class  A {
    A() {

    }
    A(int u) {

    }
    private int varrible;

    public void setVarrible(int varrible) {
        this.varrible = varrible;
    }

    public int getVarrible() {
        return this.varrible;
    }


}
class B  extends A {
    private int varrible;
    public void setVarrible(int varrible){
        this.varrible = varrible;
    }
    public int getVarrible() {
        return this.varrible;
    }
}

class D<T, V> {
    T ob;
    V ob1;
    public void nameT() {
        System.out.println(ob.getClass().getName());
    }
    public void nameV() {
        System.out.println(ob1.getClass().getName());
    }
}

class I implements Cloneable {

}

public class Demo {
    public static void main(String[] args) {
        System.out.println(5+5 +"Decyat");
    }
        

}
