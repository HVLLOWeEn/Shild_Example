package example7_inheritance;

/**
 * Created by hvllowe3n on 4/13/17.
 */
public class A2 {
    int i;
    int j;

    A2(int i, int j){
        this.i = i;
        this.j = j;
    }

    //Отображение членов класса
    void show(){
        System.out.println("i, j: " + i + ", " + j);
    }
}
class B2 extends A2{
    int k;
    B2(int k, int i, int j){
        super(i, j);
        this.k = k;
    }
    //Данный метод переопределяет метод show из суперкласса
    //Вызывая данный метод в подклассе
    //он будет скрыт в суперклассе

    //Переопределение появляться только тогда когда идентичны сигнатуры метода
    //иначе это просто перегрузка метода
    /* Переопределение */
    void show(){
        // если нужно вызвать метод суперкласса, воспользуемся ключевым словом super()
        super.show();
        System.out.println("k: " + k);
    }
    /* Перегрузка */
    void show(String msg){
        System.out.println(msg + " " + k);
    }
}
class Override{
    public static void main(String[] args){
        B2 ob = new B2(12,21,43);
        ob.show();
    }
}