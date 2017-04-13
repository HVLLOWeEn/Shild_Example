package example7_inheritance;

/**
 * Created by hvllowe3n on 4/12/17.
 */
class X {
    int a;
    X(int i){
        this.a = i;
    }
}

class Y extends X{
    int b;
    Y(int i, int j){
        super(j);
        this.b = i;
    }
}
class SupSubRef{
    public static void main(String[] args){
        X obj = new X(10);
        X obj1;
        Y obj2 = new Y(5,6);

        obj1 = obj;
        System.out.println(obj.a + " " + obj1.a);

        obj1 = obj2;
        System.out.println(obj1.a + " " + obj2.a);

    }
}
