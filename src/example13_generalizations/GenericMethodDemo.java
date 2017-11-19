package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class GenericMethodDemo {
    public static <T extends  Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[]y) {        // Обобщенный метод
        // Проверка! Массивы имеющие разную длину, не могут быть одинаковыми
        if(x.length != y.length) return false;

        for(int i = 0; i < x.length; i++)
            if(!x[i].equals(y[i])) return false;        // массивы отличаются
        return true;
    }
    public static void main(String[] args) {
        Integer nums1[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,8,4,5};
        Integer nums4[] = {1,2,8,4,5,6,7};

        if(arrayEqual(nums1, nums1))
            System.out.println("nums1 еквивалентен nums1!");
        if(arrayEqual(nums1, nums2))
            System.out.println("nums1 еквивалентен nums2!");
        if(arrayEqual(nums1, nums3))
            System.out.println("nums1 еквивалентен nums3!");
        if(arrayEqual(nums1, nums4))
            System.out.println("nums1 еквивалентен nums4!");

        // Double nums5[] = {1.0, 2.0, 3.9, 4.5};
        // if(arrayEqual(arr, nums5))
    }
}
