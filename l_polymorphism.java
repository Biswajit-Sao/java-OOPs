//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

// SEQ OF ARGUMENT

class Test{
    void show(int a,String b){ 
        System.out.println("method 1");
    }
    void show(String a,int b){ 
        System.out.println("method 2");
    }
}
public class l_polymorphism {
    public static void main(String[] args) {
        Test A=new Test();


        A.show(12,"abc"); //coll method 1

        A.show("abc",10); //than coll method 2
    }
    
}