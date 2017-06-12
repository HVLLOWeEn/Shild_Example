package example8_pakages_and_interfaces;

public class IQDemo  {
    public static void main(String[] args) {
        FixedQueue fix_obj = new FixedQueue(10);
        CircularQueue circle_obj = new CircularQueue(10);
        DynQueue dynamic_obj = new DynQueue(5);

        ICharQ interIcq;        //Ссылка на интерфейс
        char ch;
        int i;

        //Ссылка интерфейсного типа ссылаеться на обьект класса
        interIcq = fix_obj;

        for(i = 0; i < 10; i++){
            interIcq.put((char)('A' + i));
        }
        System.out.print("Содержимое очереди фиксированого размера: ");
        for(i = 0; i < 10; i++){
            ch = interIcq.get();
            System.out.print(ch + " ");
        }
        System.out.println();
        interIcq = dynamic_obj;

        for(i = 0; i < 10; i++){
            interIcq.put((char)('Z' - i));
        }
        System.out.print("Содержимое динамической очереди: ");
        for(i = 0; i < 10; i++){
            ch = interIcq.get();
            System.out.print(ch + " ");
        }

        System.out.println();
        interIcq = circle_obj;
        System.out.print("Сохранение и использование " +
                "данных кольцевой очереди: ");
        for(i = 0; i < 20; i++){
            interIcq.put((char)('a' + i));
            ch = interIcq.get();
            System.out.print(ch + " ");
        }
    }
}
class FixedQueue implements ICharQ {
    private char[] q;
    private int putloc;
    private int getloc;

    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Очередь заполнена!");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (putloc == getloc) {
            System.out.println("Очередь пуста!");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }
}

/*
* Кольцевая очередь
*/

class CircularQueue implements ICharQ {
    private char[] q;
    private int putloc;
    private int getloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc + 1 == getloc |
                (putloc == q.length) & (getloc == 0)) {
            System.out.println("Очередь заполнена!");
        }
        putloc++;
        if (putloc == q.length) reset(); //В начало очереди
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (putloc == getloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) reset();
        return q[getloc];
    }

    @Override
    public void reset() {           //В начало очереди
        putloc = getloc = 0;
    }
}

/*
* Динамическая очередь
*/

class DynQueue implements ICharQ{
    private char[] q;
    private int putloc;
    private int getloc;

    public DynQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if(putloc == q.length - 1){
            // Увеличить размер очереди
            char t[] = new char[q.length*2];

            // Скопировать элементы в новую очередь
            for(int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if(putloc == getloc) {
            System.out.println("Очередь пуста");
            return (char)0;
        }
        getloc++;
        return q[getloc];
    }
    public void reset(){
        getloc = putloc = 0;
    }
}
class DynCircleQueue implements ICharQ{
    private char[] q;
    private int putloc;
    private int getloc;

    @Override
    public void put(char ch) {

    }

    @Override
    public char get() {
        return 0;
    }

    @Override
    public void reset() {

    }
}
