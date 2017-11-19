package example7_inheritance;


import java.lang.*;
import java.lang.Override;

// Простая иерархия классов
// Абстрактный класс (не может быть объектов)
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;


    //параметризированный конструктор
    TwoDShape(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }
    // по-умолчанию
    TwoDShape(){
        height = width = 0.0;
        name = "none";
    }

    TwoDShape(double x, String name){
        width = height = x;
        this.name = name;
    }

    //Создать один обьект на основе другого
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){ return width; }
    public double getHeight(){ return height; }
    public String getName(){ return name; }

    void showDim(){
        System.out.println("Ширина и высота: "
                + width + " и " + height);
    }
    // Абстрактный метод area();
    abstract double area();
}

//Подкласс для представления треугольника
//производный от класса TwoDShapeAbstract
class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h){      //конструктор
        super(w, h, "Треугольник"); //Вызов конструктора супер класса
        this.style = s;
    }
    Triangle(){     // констр. подкласса по-умолчанию
        super();    // констр. суперкласса по-умолчанию
        style = "default";
    }
    Triangle(double x){
        super(x, "Треугольник");
        style = "Прозрачный";
    }
    Triangle(Triangle ob){
        //передача обьекта конструктору TwoDShapeAbstract (суперклассу)
        super(ob);
        style = ob.style;
    }
    //переопределение
    double area(){ return getWidth() * getHeight() / 2; }
    public void setStyle(String style){ this.style = style; }
    void showStyle(){
        System.out.println("Трехугольник " + style);
    }
}

class ColorTriangle extends Triangle{ //Многоуровневая иерархия
    private String color;
    ColorTriangle(String color, String s, double w, double h){
        super(s, w, h);
        this.color = color;
    }
    public String getColor(){ return this.color; }
    void showColor(){
        System.out.println("Цвет -> " + this.color);
    }
}

class Square extends TwoDShape {
    private String style;
    Square(String s, double w, double h){   //конструктор
        super(w, h, "Квадрат");
        style = s;
    }
    Square(){
        super();
        this.style = "default";
    }
    Square(double x, String n){
        super(x, n);
        style = "закрашенный";
    }
    public void setStyle(String style){ this.style = style; }
    void showStyle(){
        System.out.println("Квадрат " + style);
    }
    //переопределение
    double area(){
        return getWidth() * getHeight();
    }
    double perim(){
        return (getWidth() + getHeight()) * 2;
    }
}

class Rectangle extends TwoDShape{
    Rectangle(){
        super();
    }
    Rectangle(double w, double h){
        super(w, h, "Прямоугольник");

    }
    Rectangle(double x){
        super(x, "Прямоугольник");

    }
    Rectangle(Rectangle ob){
        super(ob);
    }

    /*boolean isSquare(){
        if(getWidth() != getHeight()) return false;
        else return true;
    }*/
    //переопределение
    double area(){
            return getWidth() * getHeight();
    }
}
class Ellipse extends TwoDShape{
    private String style;
    private final double pi = 3.14;
    Ellipse(){
        super();
    }
    Ellipse(String style, double w, double h){
        super(w, h, "Эллипс");
        this.style = style;
    }
    Ellipse(double x){
        super(x, "Эллипс");
        this.style = style;
    }
    public void showStyle(){
        System.out.println("Эллипс" + style);
    }
    double area(){
        return (getWidth() * getHeight() * pi);
    }
}
class Circle extends TwoDShape{
    private final double pi = 3.14;
    String style;

    Circle(double x){
        super(x, "Круг");
        this.style = style;
    }

    @Override
    double area() {
        return pi * (getWidth() * getHeight());
    }
}
