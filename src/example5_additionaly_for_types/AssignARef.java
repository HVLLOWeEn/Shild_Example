package example5_additionaly_for_types;

class AssignARef {
    public static void main(String[]args){
        int[] nums1 = new int [10];
        int[] nums2 = new int[10];

        for(int i = 0; i < 10; i++)
            nums1[i] = i;
        for(int i = 0; i < 10; i++)
            nums2[i] = -i;


        System.out.println("Массив nums1: ");
        for(int i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println("\nМасссив nums2: ");
        for(int i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        nums2 = nums1;              // ссылка на массив. в результате присваивания ссьmки -
                                    // на массив numsl переменной nums2 обе переменные ссьmаются на один и тот же массив.
        nums2[3] = 99;
        for(int i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");

    }
}
