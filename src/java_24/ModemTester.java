package java_24;

public class ModemTester{
    public static void main(String[] arguments){
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 5000000;
        gateway.speed = 4000000;
        System.out.println("попытка подключения кабельного модема: ");
        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnest();
        System.out.println("попытка подключения DSL-модема: ");
        gateway.displaySpeed();
        gateway.connect();
        gateway.disconnest();
    }
}
