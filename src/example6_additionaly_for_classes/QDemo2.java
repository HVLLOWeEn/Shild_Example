package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 02.04.2017.
 */
class Queue{
    private char q[];		    // массив для хранения элементов очереди(Символьный)
    private int putloc, getloc; // индексы для вставки и извлечения
                        //элементов из очереди

    Queue(Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        //Копировать элементы очереди
        for(int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }
    Queue(char[] a){
        putloc = getloc = 0;
        q = new char[a.length + 1];
        for(int i = 0; i < a.length;i++) put(a[i]);
    }
    Queue(int size){
        putloc = getloc = 0;
        q = new char[size + 1];
    }
    void put(char ch){
        if(putloc == q.length - 1) {
            System.out.println("Очередь заполнена");
            return;
        }
            putloc++;
            q[putloc] = ch;
    }
    char get(){
        if(putloc == getloc) {
            System.out.println("Очередь пуста");
            return (char)0;
        }
        getloc++;
        return q[getloc];
    }
}
public class QDemo2 {
    public static void main(String[] args){
        Queue q = new Queue(10);

        char []ch = {'T', 'o', 'm'};
        Queue q1 = new Queue(ch);

        for(int i = 0; i < 10; i++){
            q.put((char)('A' + i));
        }
        Queue q2 = new Queue(q);

        System.out.println("Содержимое очереди 1: ");
        for(int i = 0; i < 10;i++){
            System.out.print(q.get() + ", ");
        }

        System.out.println("\nСодержимое очереди 2: ");
        for(int i = 0; i < 3;i++){
            System.out.print(q1.get() + ", ");
        }

        System.out.println("\nСодержимое очереди 3: ");
        for(int i = 0; i < 10;i++){
            System.out.print(q2.get() + ", ");
        }
    }
}
