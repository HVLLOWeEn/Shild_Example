package example7_inheritance;

/**
 * Created by hvllowe3n on 4/13/17.
 */
public class Sup {
    void who(){
        System.out.println("who() в Sup");
    }
}
class Sub1 extends Sup{
    void who(){
        System.out.println("who() в Sub1");
    }
}
class Sub2 extends Sup{
    void who(){
        System.out.println("who() в Sub2");
    }
}

class DynDispDemo{
    public static void main(String[] args){
        //Динамическая дистпечеризация методов
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup superRef;

        superRef = superOb;
        superRef.who();

        superRef = subOb1;
        superRef.who();

        superRef = subOb2;
        superRef.who();
    }
}
