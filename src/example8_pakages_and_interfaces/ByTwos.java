package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 4/16/17.
 */
public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos(){
        start = val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reser() {
        start = val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = val = x;
        prev = x - 2;
    }

    int getPreviwes(){
        return prev;
    }
}
