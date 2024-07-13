// INHERITANCE WITH USE "extends" KEYWORD

class Animal{ //PARENT CLASS OR SUPER CLASS
    void eat(){
        System.out.println("I am Eating");
    }
}
public class g_Inheritance extends Animal{ //CHILD CLASS OR SUB-CLASS
    public static void main(String[] args) {
        g_Inheritance A=new g_Inheritance();
        A.eat();
    }
}
