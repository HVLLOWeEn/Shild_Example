package example8_pakages_and_interfaces;

import example9_Exception.*;

/**
 * Created by hvllowe3n on 4/17/17.
 */
public interface ICharQ1 {
    void put(char ch) throws QueueFullException;
    char get() throws QueueEmptyException;
    void reset();
}
