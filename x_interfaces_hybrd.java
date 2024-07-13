//code by Biswajit
interface A{
    default void show(){
        System.out.println("METHOD 1");
    }
}
interface B extends A{
    default void show1(){
        System.out.println("METHOD 2");
    }
}
interface C extends A{
    default void show2(){
        System.out.println("METHOD 3");
    } 
}
class D implements B,C {
    void show3(){
        System.out.println("METHOD 3");

    }
}

public class x_interfaces_hybrd {
    public static void main(String[] args) {
        D a=new D();

        a.show();
        a.show1();
        a.show2();
        a.show3();
        
    }
}
