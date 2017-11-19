package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */

// Использование ключ. слова synchronized для управления доступом
public class SumArray {
    private int sum;

    // synchronized int sumArray(int[] nums)    // Синхронизированный метод
    int sumArray(int[] nums) {                  // Не синхронизированный метод
        sum = 0; // обнулить сумму

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.println("Текущее значение суммы для: " +
                    Thread.currentThread().getName() + ": " + sum);
            try {
                Thread.sleep(10);   // Разрешить переключение задач
            } catch(InterruptedException exc) {
                System.out.println("Прерывание основного потока!");
            }
        }
        return sum;
    }
}
