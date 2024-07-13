//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

//STRING AND STRINGBUFFER 

class Test{
    void show(String a){ //CHILD METHOD
        System.out.println("method 1");
    }
    void show(StringBuffer a){ //PRANT METHOD
        System.out.println("method 2");
    }
}
public class p_polymorphism {
    public static void main(String[] args) {
        Test A=new Test();


        A.show("aaa"); //COLL METHOD 1 BECOUSE CHILD METHOD IS COLL FASTLY
    }
    
}