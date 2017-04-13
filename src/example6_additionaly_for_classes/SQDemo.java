package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 05.04.2017.
 */
class QuickSort{
    private static void qs(char[] items, int left, int right){
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left+right)/2];

        do{
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;

            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        }while(i <= j);
        if(left < j) qs(items, left, j);
        if(right > i) qs(items, i, right);
    }
    static void qsort(char[] items){  // Метод для упрощение быстрой сортировки (передавая в аргументы лишь имя массива)
        qs(items, 0, items.length - 1);
    }
}
class SQDemo {
    public static void main(String[] args) {
        char[] a = {'x', 'a', 's', 'f', 'g', 'l'};
        System.out.println("Исходный массив: ");
        for (char x :
                a) {
            System.out.print(x + " ");
        }
        QuickSort.qsort(a);
        System.out.println("\nОтсортированный массив: ");
        for (char x :
                a) {
            System.out.print(x + " ");
        }
    }
}