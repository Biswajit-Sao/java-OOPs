//SINGLE INHERITANCE 

class A{ 
    void showA(){
        System.out.println("A class method");
    }
}
public class h_Single_Inheritance extends A {
    void showB(){
        System.out.println("B class method");
    }
    public static void main(String[] args) {
        h_Single_Inheritance ob1=new h_Single_Inheritance();
        ob1.showA();
        ob1.showB();

        A ob2 =new A();
        ob2.showA();
        // ob2.showB(); ERROR
    }
}
