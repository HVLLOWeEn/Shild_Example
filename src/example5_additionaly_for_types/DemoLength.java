package example5_additionaly_for_types;

/**
 * Created by HVLLO on 18.03.2017.
 */
class DemoLength {
    public static void main(String[] args){
        int[] arr = new int[10];
         int nums[][] = new int[3][];
         nums[0] = new int[25];
         nums[1] = new int[10];
         nums[2] = new int[4];
        System.out.println(arr.length);
        System.out.println(nums[0].length);
        System.out.println(nums[1].length);
        System.out.println(nums[2].length);
        System.out.println("\n");
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }

    }
}
