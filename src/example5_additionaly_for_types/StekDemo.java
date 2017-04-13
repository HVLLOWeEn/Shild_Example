package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class Stek{
    char s[];
    int putloc, getloc;

    Stek(int size){
        s = new char[size + 1];
        putloc = getloc = 0;
    }

    void put_S(char ch){
        if(putloc < s.length + 1){
            System.out.println("Stack Overflow");
            return;
        }
        putloc++;
        s[putloc] = ch;
    }
    int get_S(){
       return 0;
    }
}
class StekDemo {
}
