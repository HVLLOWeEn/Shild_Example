package example3_operators;

/**
 * Created by HVLLO on 22.02.2017.
 */
public class SwitchDemo {
    public static void main(String[] args){
        for (int i = 0; i < 10;i++){
            switch(i){
                case 0:{
                    break;
                }
                case 1:{
                    System.out.println(i);
                    break;
                }
                case 2:{
                    System.out.println(i);
                    break;
                }
                case 3: {
                    System.out.println(i);
                    break;
                }
                case 4:{
                    System.out.println(i);
                    break;
                }
                case 5:{
                    System.out.println(i);
                    break;
                }
                case 6:{
                    System.out.println(i);
                    break;
                }
                case 7:{
                    System.out.println(i);
                    break;
                }
                case 8:{
                    System.out.println(i);
                    break;
                }
                case 9:{
                    System.out.println(i);
                    switch (i){         // Вложенный оператор switch();
                        case 9:{
                            System.out.println("9");
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
