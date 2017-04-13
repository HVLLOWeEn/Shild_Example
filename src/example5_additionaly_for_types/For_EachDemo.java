package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class For_EachDemo {
    public static void main(String[] args){
        int [] arr = {2324,6546,46,54,3};
        for (int x:
             arr) {
            System.out.print(x + " ");
            x *= x;
        }
        System.out.println();
        for (int x:
             arr) {
            System.out.print(x + " ");
        }


        int[][] arr1 = new int[3][5];       // Пример того как работать с циклом foreach для многомерных массивов
        for(int i =0 ; i < 3; i++){
            for(int j = 0; j < 5; j++){
                arr1[i][j] = (i+1)*(j+1);
            }
        }
        int sum = 0;
        for (int x[]:           // x[] - ссылка на одномерный целочисленный массив
             arr1) {
            for (int y:
                 x) {
                sum += y;
            }
        }
        System.out.println("Сумма всех значений в массиве = "+ sum);
    }
}
