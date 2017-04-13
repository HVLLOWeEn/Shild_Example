package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 05.04.2017.
 */
class StaticMeth {
    static int value = 1024;

    static int valDiv2(){
        return value / 2;
    }
}
class SDemo2{
    public static void main(String[] args){
        System.out.println(StaticMeth.value);
        System.out.println(StaticMeth.valDiv2() +
                "\n");

        StaticMeth.value = 12;

        System.out.println(StaticMeth.value);
        System.out.println(StaticMeth.valDiv2());
    }
}
