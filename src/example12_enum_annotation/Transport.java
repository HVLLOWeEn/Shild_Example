package example12_enum_annotation;

/**
 * Created by romansynovets on 6/12/17.
 */
public enum Transport {
    CAR(65), TRACK(55), AIRPLANE(600), TRAIN(70), BOAL(22) ;    // Инициализация констант
    private int speed;      // переменные экземпляра допустимы в enum

    Transport(int s) { this.speed = s; }
    int getSpeed() { return speed; }            // методы также допустимы в enum
}
