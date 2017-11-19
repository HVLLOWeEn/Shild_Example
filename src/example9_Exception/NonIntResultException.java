package example9_Exception;


/**
 * Created by romansynovets on 6/2/17.
 */
public class NonIntResultException extends Exception {
    private int a;
    private int b;

    public NonIntResultException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Result operation "
                + a + " / " + b + " none integer number!";
    }
}
class CustomExcDemo {
    public static void main(String[] args) {
        int[] arr = {12, 35, 345, 345, 67, 87, 46,546,67};
        int[] arr1 = {5, 56, 3, 1, 0, 45};

        for (int i = 0; i < arr.length; i++) {
            try {
                if ((arr[i] % arr1[i]) != 0)
                    throw new NonIntResultException(arr[i], arr1[i]);

                System.out.println(arr[i]  + " / "
                        + arr1[i] + " = " + arr[i] / arr1[i]);

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println(exc.toString());
            }
            catch (ArithmeticException exc) {
                System.out.println(exc.toString());
            }
            catch (NonIntResultException exc) {
                System.out.println(exc.toString());
            }
        }
    }
}
