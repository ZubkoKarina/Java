package java_24;

public class CableModem extends Modem {
    String method = "кабельное подключение";
    
    public void connect(){
        System.out.println("подключение к Интернету...");
        System.out.println("используем " + method);
    }
}
