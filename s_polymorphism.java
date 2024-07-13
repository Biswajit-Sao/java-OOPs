//RUN TIME POLYMORPHISM (DYNAMIC POLYMORPHISM)
//METHOD OVERRIDING
//SEQ OF ARG
class A{
    void show(int a, String b){
        System.out.println("METHOD 1");
    }
}
public class s_polymorphism extends A { //USING INHERITANCE

    void show(int a, String b){
        System.out.println("METHOD 2");
    }
    public static void main(String[] args) {
        A a=new A();
        a.show(10,"abc");//METHOD 1

        s_polymorphism b=new s_polymorphism();
        b.show(20,"abc");//METHOD 2
    }
}
