package example5_additionaly_for_types;

/**
 * Created by Roman on 20.03.2017.
 */
class Queue{
    int q0[];        // массив для хранения элементов очереди(Целочисленный)
    char q[];		 // массив для хранения элементов очереди(Символьный)
    double q1[];     // массив для хранения элементов очереди(Вещественный)

    int putloc, getloc; // индексы для вставки и извлечения
                        //элементов из очереди
    Queue(int size){
        q = new char[size + 1];	//Выделить память для очереди
        q0 = new int[size + 1];
        q1 = new double[size + 1];
        putloc = getloc = 0;
    }

    // метод put() помещает элемент в очередь
    void putToChar(char ch){
        if(putloc == q.length -1){ 		// условие на случай переполнение очереди
            System.out.println("Очередь заполнена!");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    void putToInteger(int ch){
        if(putloc == q.length-1){
            System.out.println("Очередь заполнена!");
            return;
        }
        putloc++;
        q0[putloc] = ch;
    }
    void putToDouble(double ch){
        if(putloc == q.length-1){
            System.out.println("Очередь заполнена!");
            return;
        }
        putloc++;
        q1[putloc] = ch;
    }

    char getToChar(){
        if(putloc == getloc){
            System.out.println("Очередь пуста");
            return (char)0;
        }
        getloc++;
        return q[getloc];
    }
    int getToInteger(){
        if(putloc == getloc){
            System.out.println("Очередь пуста");
            return 0;
        }
        getloc++;
        return q0[getloc];
    }
    double getToDouble(){
        if(putloc == getloc){
            System.out.println("Очередь пуста!");
            return 0.0;
        }
        getloc++;
        return q1[getloc];
    }
}

class QDemo{
    public static void main(String[] args) {
        // примитивный способ использования очереди
        Queue que = new Queue(5);
        que.putToChar('h');
        que.putToChar('e');
        que.putToChar('l');
        que.putToChar('l');
        que.putToChar('o');

        System.out.print(que.getToChar());
        System.out.print(que.getToChar());
        System.out.print(que.getToChar());
        System.out.print(que.getToChar());
        System.out.print(que.getToChar());


        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i, ch0;

        System.out.println("\nИcпoльзoвaниe очереди ЬigQ " +
                "для сохранения алфавита");
        // Помещение
        for(i = 0; i < 26; i++)
            bigQ.putToChar((char)('A' + i));

        System.out.println("Содержимое из очереди bigQ: ");
        // Извлечене
        for(i = 0; i < 26; i++){
            ch = bigQ.getToChar();
            if(ch != (char)0) System.out.print(ch + " ");
        }

        System.out.println("\n");
        System.out.println("Использование очереди smallQ для генерации ошибок ");
        for(i = 0; i < 5;i++) {
            System.out.println("Попытка сохранить: " + (char)('Z' - i));
            smallQ.putToChar((char)('Z' - i));
        }

        System.out.println("Содержимое smallQ");
        for(i = 0; i < 5; i++){
            ch = smallQ.getToChar();
            if(ch != (char)0)System.out.print(ch + " ");
        }

        Queue newQint = new Queue(5);

        for(i = 0; i < 5; i++){
            newQint.putToInteger(i);
        }
        for(i = 0; i < 5; i++){
            ch0 = newQint.getToInteger();
            System.out.print(ch0 + " ");
        }
    }

}