package example5_additionaly_for_types;

/**
 * Created by HVLLO on 18.03.2017.
 */
class ArrayFuncDemo {
    public static int []arr(int n){
        int[] array = new int[n];
        for(int i = 0; i < array.length;i++)
            array[i] = i+1;

        return array;
    }
    public static void main(String[] args){
        int num = 10, res[] = new int[num];
        for(int i = 0; i < 10; i++){
           res = arr(num);
            System.out.println(res);
        }


    }
}
