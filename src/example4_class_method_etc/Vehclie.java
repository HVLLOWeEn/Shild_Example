package example4_class_method_etc;

/**
 * Created by HVLLO on 25.02.2017.
 */
class Vehicle {

    // Здесь обьявлены члены класса
    // Поля класса

    int passengers; // Кол-во пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребление топлива в милях на галон

    /* Добавляем параметризированный конструктор для класса Vehicle */
    Vehicle(int pass, int fuel, int mg){
        passengers = pass;
        fuelcap = fuel;
        mpg = mg;
    }

    // Отобразить дальность поездки транспортрого средства
    void range(){
        System.out.println("Дальность - " + (fuelcap * mpg) + " миль.");
    }


    // оператор return для типа void
    void myMeth(){
        int i;
        for(i = 0; i <10; i++){
            if(i == 5) return;
            System.out.println();
        }
    }

}

class VehiclieDemo{
    public static void main(String[] args) {
        Vehicle minivan;                           // обьявить ссылку на обьект
        minivan = new Vehicle(7,16,21);                   // выделить память для обьекта типа Vehiclie
        Vehicle sportcar = new Vehicle(2, 14,12);

        /**
        // Инициализация полей для обьекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Инициализация полей для обьекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;*/

        System.out.println(minivan.fuelcap);
        System.out.println(minivan.mpg);

                                                    //обьект.член - .точечная нотация
                                                    //minivan = sportcar;
        /**Расчитать дальность поездки при полном баке... (В милях)

        // int rangeMinivan, rangeSportCar;
        // rangeMinivan = minivan.fuelcap * minivan.mpg;
         rangeSportCar = sportcar.fuelcap * sportcar.mpg;*/


        System.out.println("Мини фургон может перевезти " +
                minivan.passengers + " пассажиров. ");
        minivan.range();                                      // Вызов метода range() для отображения дальтности поездки

        System.out.println("Спорткар может перевезти " +
                sportcar.passengers + " пассажиров. ");
        sportcar.range();


       // Vehicle car1 = new Vehicle();
       // Vehicle car2 = car1;             // что переменная car1 что car2 класса Vehicle ссылаються в одинаковые объкты
       // car1.mpg = 26;

        /* Когда переменная carl присваивается переменой car2,
           в конечном итоге переменная car2 просто ссылается на тот же самый объект, что и переменная carl.
        */

        // Vehicle car3 = new Vehicle();
        // car2 = car3;

        //ссылка на объект в переменной car1 не меняется (car1.mpg = 26;)

        // System.out.println(car1.mpg);
        // System.out.println(car2.mpg);
        // System.out.println(car3.mpg);

    }
}

