package example6_additionaly_for_classes;

/**
 * Created by hvllowe3n on 4/9/17.
 */
class Stack {
    private char[] s;
    private int putloc, getloc;

    public Stack(int size){
        s = new char[size + 1];
        putloc = 0; getloc = s.length;
    }
    public void put(char c){
        putloc++;
        s[putloc] = c;
    }
    public char get(){
        getloc--;
        return s[getloc];
    }
}
class StackDemo{
    public static void main(String[] args){
        Stack ob = new Stack(5);
        for(int i = 0; i < 5; i++)
            ob.put((char)(48 + i));

        for(int i = 0; i < 5; i++)
            System.out.println(ob.get());
    }
}
