package example4_class_method_etc;

/**
 * Created by hvllowe3n on 3/7/17.
 */
class New_Vehiclie {
    int passengers;     // Кол-во пасссажиров
    int fuelcap;        // Емкость топливного бака
    int mpg;            // Потребление топлива в милях на галлон

    // Определить дальность поездки транспортного средства
    int range(){
        return fuelcap * mpg;
    }

    // Расчитать обьем топлива, необходимого транспортному
    // средству для преодоления заданного растояния
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}
class CompFuel{
    public static void main(String[] args){
        New_Vehiclie minivan = new New_Vehiclie();
        New_Vehiclie sportcar = new New_Vehiclie();
        double gallons;
        int dist = 252;

        // Присвоить значение полям для объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значение полям для объекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                " миль мини фургону понадобиться " + gallons +
                " галлонов топлива." );

        gallons = sportcar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                " миль спортивному автомобилю понадобиться " + gallons +
                " галлонов топлива.");


    }
}
