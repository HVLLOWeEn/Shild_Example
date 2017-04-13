package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 06.04.2017.
 */
class Outer {
    private int nums[];

    Outer(int[] nums){
        this.nums = nums;
    }
    void analyze(){
        Inner inOb = new Inner();

        System.out.println("Минимальное значение = " + inOb.min());
        System.out.println("Максимальное значение = " + inOb.max());
        System.out.println("Среднее арифметическое = " + inOb.avg());
    }
    class Inner{
        int min(){
            int m = nums[0];
            for(int i = 0; i < nums.length; i++){
                if(m > nums[i]) m = nums[i];
            }
            return m;
        }
        int max(){
            int m = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if(m < nums[i]) m = nums[i];
            }
            return m;
        }
        int avg(){
            int a = 0;
            for(int i = 0; i <nums.length; i++){
                a += nums[i];
            }
            return a / nums.length;
        }
    }
}
class OutDemo{
    public static void main(String []args){
        int []arr = {12,34,46,547,68,43,12,32345};
        Outer ouOb = new Outer(arr);
        ouOb.analyze();
    }
}
