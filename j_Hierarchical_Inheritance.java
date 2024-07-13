//HIERARCHICAL INHERITANCE

class A{
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");
    }
}
public class j_Hierarchical_Inheritance extends A{
    void showC(){
        System.out.println("C calss method");
    }
    public static void main(String[] args) {
        A ob1=new A();
        ob1.showA();
        // ob1.showB();
        // ob1.showC();

        System.out.println("-----------------------------");

        B ob2=new B();
        ob2.showA();
        ob2.showB();
        // ob2.showC();

        System.out.println("-----------------------------");

        j_Hierarchical_Inheritance ob3=new j_Hierarchical_Inheritance();
        ob3.showA();
        // ob3.showB();
        ob3.showC();

    }
}
