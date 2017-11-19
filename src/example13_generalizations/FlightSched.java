package example13_generalizations;

class Counter <T>{
    T ob;
    public Counter(T ob) {
        this.ob = ob;
    }
    public T method() {
        return ob;
    }
}


public class FlightSched {
    public static <T extends Number> T meth(T ob, T ob1) {
        if(ob.equals(ob1)) return ob;
        else return ob1;
    }
    public static void main(String[] args) {
        Counter ob = new Counter(new Double(12.0));     // Базовый тип 
        double d = (double)ob.method();

    }
}