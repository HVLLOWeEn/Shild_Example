package example5_additionaly_for_types;


class TwoDemo {
    public static void main(String[] args){
        int t, i;
        int[][] table = new int[3][4];
        for(t = 0; t < 3;++t){
            for(i = 0; i < 4;++i){
                table[t][i] = (t*4)+i+1;
                System.out.print(table[t][i] + ", ");
            }
            System.out.println();
        }

        System.out.println("\n");
        int [] arr = new int[10];
        for(i = 0; i < arr.length; i++){
            if(i != 5) { arr[i] = i; }
            else continue;
        }

        for(i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
    }
}
