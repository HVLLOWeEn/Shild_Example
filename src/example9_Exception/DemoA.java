package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public class DemoA extends Exception {
    public String toString(){
        return "DemoA it's Exception";
    }
}
class DemoB extends DemoA {
    public String toString() {
        return "DemoB it's Exception";
    }
}
class DemoC {
    /*public static void main(String[] args) {
        for(int i = 0; i < 2; i++) {
            try {
                if(i == 0)
                    throw new DemoA();
                else
                    throw new DemoB();

            } catch (DemoA exc) {
                System.out.println(exc.toString());
            } catch (DemoB exc) {
                System.out.println(exc.toString());
            }
        }
    }*/
}
