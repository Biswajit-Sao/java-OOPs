//RUN TIME POLYMORPHISM (DYNAMIC POLYMORPHISM)
//METHOD OVERRIDING

//PROB
//INVOKONG OVERRIDIN METHOD FROM SUB-CLASS?
// USING "super" KEYWORD
class A{
    void show(){
        System.out.println("METHOD 1");
    }
}
public class u_polymorphism extends A { //USING INHERITANCE

    void show(){
        super.show();
        System.out.println("METHOD 2");
    }
    public static void main(String[] args) {

        u_polymorphism b=new u_polymorphism();
        b.show();//COLL METHOD 1 AND METHOD 2
    }
}
