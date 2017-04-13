package example5_additionaly_for_types;

/**
 * Created by HVLLO on 17.03.2017.
 */
class Bubble {
    public static void main(String[] args){
        int []nums = {213123,43534,234,1232343,-324234,-54654,32423,345435,467586,9};
        System.out.println("Исходный массив: ");
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println(); int temp;
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j < nums.length - 1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
    }
}
