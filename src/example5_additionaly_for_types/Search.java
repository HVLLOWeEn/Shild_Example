package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class Search {
    public static void main(String[] args){
        int[] nums = {6,6757,324,67,23490,45};
        int value = 67454;
        boolean found = false;

        for (int x:
             nums) {
            if(x == value){
                found = true;
                break;
            }
        }
        if(found) System.out.println("Элемент найден!");
        else System.out.println("Данного элемента нет!");
    }
}
