package example5_additionaly_for_types;

/**
 * Created by Roman on 27.03.2017.
 */
class Encode {
    public static void main(String[] args){
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "Synovets";
        int index = 0;
        System.out.println("Исходный текст: " + msg);
        // Шифровка сообщения
        for(int i = 0; i < msg.length(); i++){
            // Построение зашифрованой строки сообщения
            if(index != 8){
                encmsg += (char)(msg.charAt(i) ^ key.charAt(index));
                index++;
            }
            else continue;
        }
        System.out.println("Зашифрованное сообщение: " + encmsg);
        // Дешифровка сообщения
        index = 0;
        for (int i = 0; i < msg.length(); i++) {
            // Построение дешифрованной строки сообщения
            if(index != 8) {
                decmsg += (char) (encmsg.charAt(i) ^ key.charAt(index));
                index++;
            }
        }
        System.out.println("Дешифрованное сообщение: " + decmsg);
    }
}
