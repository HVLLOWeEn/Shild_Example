package example7_inheritance;

/**
 * Created by HVLLO on 25.02.2017.
 */
class Vehicle {

    private int passengers; // Кол-во пассажиров
    private int fuelcap;    // Емкость топливного бака
    private int mpg;        // Потребление топлива в милях на галон

    /* Добавляем параметризированный конструктор для класса Vehicle */
    Vehicle(int pass, int fuel, int mg){
        passengers = pass;
        fuelcap = fuel;
        mpg = mg;
    }

    // Отобразить дальность поездки транспортрого средства
    int range(){
        //System.out.println("Дальность - " + (fuelcap * mpg) + " миль.");
        return (fuelcap + mpg);
    }

    double fuelneded(int miles){
        return (double) miles / mpg;
    }

    // Passangers
    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
    public int getPassengers(){
        return this.passengers;
    }

    // Fuelcap
    public void setFuelcap(int fuelcap){
        this.fuelcap = fuelcap;
    }
    public int getFuelcap(){
        return this.fuelcap;
    }

    //MPG's
    public void setMpg(int mpg){
        this.mpg = mpg;
    }
    public int  getMpg(){
        return this.mpg;
    }
}
