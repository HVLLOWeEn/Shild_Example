package example7_inheritance;

/**
 * Created by hvllowe3n on 4/11/17.
 */

class Track extends Vehicle{
    private int cargocap;   //Грузоподьемность в фунтах

    //Конструктор:
    Track(int p, int f, int m,int cargocap){
        super(p,f,m);
        this.cargocap = cargocap;
    }
    public void putCargo(int cargocap){
        this.cargocap = cargocap;
    }
    public int getCargo(){
        return this.cargocap;
    }

}
class TrackDemo {
    public static void main(String[] args){
        Track semi = new Track(2,200, 7, 44000);
        Track pickup = new Track(3,28,15,2000);

        double gallons;
        int dist = semi.range();

        gallons = semi.fuelneded(dist);
        System.out.println("Грузовик может перевезти "
                + semi.getCargo() + " фунтов");

        System.out.println("Для преодоления "
                + dist + " миль, грузовику необходимо: " + gallons
                +" галлонов топлива\n");

        dist = pickup.range();
        gallons = pickup.fuelneded(dist);
        System.out.println("Пикап может перевезти "
                + pickup.getCargo() + " фунтов");

        System.out.println("Для преодоления "
                + dist + " миль, пикапу необходимо: " + gallons
                +" галлонов топлива\n");
    }
}
