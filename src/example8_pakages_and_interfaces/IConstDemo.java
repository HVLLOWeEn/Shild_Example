package example8_pakages_and_interfaces;

/**
 * Created by HVLLO on 25.04.2017.
 */
public class IConstDemo implements IConst {
    public static void main(String[] args){
        int nums[] = new int[MAX];

        for(int i = MIN; i < 11; i++){
            if(i >= MAX) System.out.println(ERORRMSG);
            else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
