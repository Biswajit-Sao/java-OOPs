//RUN TIME POLYMORPHISM (DYNAMIC POLYMORPHISM)
//METHOD OVERRIDING
//SAME NAME
//NO OF ARG
class A{
    void show(){
        System.out.println("METHOD 1");
    }
}
public class r_polymorphism extends A { //USING INHERITANCE

    void show(){
        System.out.println("METHOD 2");
    }
    public static void main(String[] args) {
        A a=new A();
        a.show();//METHOD 1

        r_polymorphism b=new r_polymorphism();
        b.show();//METHOD 2
    }
}
