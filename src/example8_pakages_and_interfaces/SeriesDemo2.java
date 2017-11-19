package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 4/16/17.
 */
public class SeriesDemo2 {
    public static void main(String[] args){
        ByTwos ob1 = new ByTwos();
        ByteTrees ob2 = new ByteTrees();

        Series ob; // Ссылка интерфейсного типа
        for(int i = 0; i < 5; i++) {
            ob = ob1;       //Ссылка интерфейсного типа ссылается на обьект ob1 класса ByTwos
            System.out.println("Следующее значение (ByTwos): "
                    + ob.getNext());
            ob = ob2;
            System.out.println("Следующее значение (ByteTrees): "
                    + ob.getNext());

            //System.out.println(Следующее значение (ByteTrees): "
            //+ ob.метод_самого_класса());      ->  не допустимо, по скольку интерфейсу ничего не известно
                                                // об этих методах!
        }
    }
}
