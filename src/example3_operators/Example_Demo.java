package example3_operators;

import java.util.Scanner;
public class Example_Demo{
    public static void main(String[] args){
        double x, y, z;
        System.out.print("Press to value: ");
        Scanner num = new Scanner(System.in);
        z = num.nextDouble();
        if(z <= 2){
            x = (Math.pow(z, 2)) / 2;
            y = ((5*x) / Math.cos(x))+(7 *(Math.log(Math.pow(x, 3) / 3)));
            System.out.println("Your result = " + y);
        }
        else if(z > 2) {
            x = Math.sqrt(z);
            y = ((5*x) / Math.cos(x))+(7 *(Math.log(Math.pow(x, 3) / 3)));
            System.out.println("Your result = " + y);
        }
    }
}