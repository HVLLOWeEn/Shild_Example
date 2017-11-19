package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 4/16/17.
 */
public class SeriesDemo {
    public static void main(String[] args){
        ByTwos ob = new ByTwos();

        for(int i = 0; i < 5; i++)
            System.out.print("Следующее значение: "
                    + ob.getNext() + " ");

        System.out.println("\nСброс");
            ob.reser();

        for(int i = 0; i < 5; i++)
            System.out.print("Следующее значение: "
                    + ob.getNext() + " ");

        System.out.println("Начальное значение = 100");
        ob.setStart(100);
        for(int i = 0; i < 5; i++){
            System.out.print("Следующее значение: "
                    + ob.getNext() + " ");
        }
    }
}
