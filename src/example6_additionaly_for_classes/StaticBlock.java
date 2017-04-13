package example6_additionaly_for_classes;

class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static{     //Этот блок выполняется nри загрузке класса.
        System.out.println("Мы внутри блока static: ");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg){
        System.out.println(msg);
    }
}
class SDemo3{
    public static void main(String[] args){
        StaticBlock ob1 = new StaticBlock("Внутри конструктора StaticBlock");

        System.out.println("Корень квадратный из 2: " +
                            StaticBlock.rootOf2);
        System.out.println("Корень квадратный из 3: " +
                StaticBlock.rootOf3);
    }
}
