package example7_inheritance;

/**
 * Created by hvllowe3n on 4/14/17.
 */
public class Alpha {
    Alpha(){
        System.out.println("Мы в конструкторе Alpha");
    }
}
class Beta extends Alpha{
    Beta(){
        System.out.println("Мы в конструкторе Beta");
    }
}
class Gamma extends Beta{
    Gamma(){
        System.out.println("Мы в конструкторе Gamma");
    }
}

class ShowInfoAboutClasses{
    public static void main(String[] args){
        Gamma G = new Gamma();
    }
}
