package java_24;

public class DslModem extends Modem{
    String method = "DSL-подключение";
    
    public void connect(){
        System.out.println("подключение к Интернету...");
        System.out.println("используем " + method);
    }
    
    public void disconnest(){
        System.out.println("отключение...");
    }
}
