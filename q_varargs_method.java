//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

//VARARGS METHOD 

class Test{
    void show(int... a){ 
        System.out.println("method 1");
    }
    void show(int a){ 
        System.out.println("method 2");
    }
}
public class q_varargs_method {
    public static void main(String[] args) {
        Test A=new Test();


        A.show(10,20,30);; 
    }
    
}
