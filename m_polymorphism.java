//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

// TYPES OF ARGUMENT

class Test{
    void show(int a){ 
        System.out.println("method 1");
    }
    void show(String a){ 
        System.out.println("method 2");
    }
}
public class m_polymorphism {
    public static void main(String[] args) {
        Test A=new Test();


        A.show(12); //coll method 1

        A.show("abc"); //coll method 2
    }
    
}