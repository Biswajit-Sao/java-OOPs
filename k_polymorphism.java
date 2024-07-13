//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

// NO OF ARGUMENT

class Test{
    void show(){ //0 org
        System.out.println("method 1");
    }
    void show(int a){   //1 org
        System.out.println("method 2");
    }
}
public class k_polymorphism {
    public static void main(String[] args) {
        Test A=new Test();

        // 0 org
        A.show(); //coll method 1

        // 1 org
        A.show(10); //than coll method 2
    }
    
}