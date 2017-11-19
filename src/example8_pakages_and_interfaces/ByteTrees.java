package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 4/16/17.
 */
public class ByteTrees implements Series {
    int start;
    int val;

    ByteTrees(){
        start = val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reser() {
        val = start = 0;
    }

    @Override
    public void setStart(int x) {
        start = val = x;
    }

}
