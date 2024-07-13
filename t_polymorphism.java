//RUN TIME POLYMORPHISM (DYNAMIC POLYMORPHISM)
//METHOD OVERRIDING
//TYPE OF ARG
class A{
    void show(Object a){
        System.out.println("METHOD 1");
    }
}
public class t_polymorphism extends A { //USING INHERITANCE

    void show(String a){
        System.out.println("METHOD 2");
    }
    public static void main(String[] args) {
        A a=new A();
        a.show("abc");//METHOD 1

        t_polymorphism b=new t_polymorphism();
        b.show("abc");//METHOD 2
    }
}

