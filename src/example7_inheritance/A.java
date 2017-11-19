package example7_inheritance;

/**
 * Created by hvllowe3n on 4/11/17.
 */
class A {
    int i;
}
class B extends A{
    int i;
    B(int v, int v1){
        super.i = v;        // Ссылается переменную класса А (Суперкласса)
        this.i = v1;        // Ссылка на данный класс В (Подкласс)
    }
    void show(){
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + this.i);
    }
}
class Uses{
    public static void main(String[] args){
        B ob = new B(12,14);
        ob.show();
    }
}