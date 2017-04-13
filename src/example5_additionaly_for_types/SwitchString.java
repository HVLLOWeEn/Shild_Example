package example5_additionaly_for_types;

/**
 * Created by Roman on 21.03.2017.
 */
class SwitchString {
    public static void main(String[] args){
        String command = "cancel";

        switch(command){
            case "connect":{
                System.out.println("Подключение...");
                break;
            }
            case "cancel":{
                System.out.println("Отмена...");
                break;
            }
            case "disconnect":{
                System.out.println("Нет подключения...");
                break;
            }
            default:{
                System.out.println("Неверная команда!");
                break;
            }
        }
    }
}
