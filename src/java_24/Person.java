package java_24;

public class Person{    
    public static void main(String[] args) {
         
        cPerson bob = new cPerson();      // вызов первого конструктора без параметров
        bob.displayInfo();
         
        cPerson tom = new cPerson("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();
         
        cPerson sam = new cPerson("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}


class cPerson{
     
    String name;    // имя
    int age;        // возраст
    
    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/
    
    cPerson()
    {
        name = "Undefined";
        age = 18;
    }
    cPerson(String n)
    {
        name = n;
        age = 18;
        //или this(name, 18);
    }
    cPerson(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}