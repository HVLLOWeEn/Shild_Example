package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 5/2/17.
 */
public interface Alpha {
    default void reset(){
        System.out.println("Alpha");
    }

}
