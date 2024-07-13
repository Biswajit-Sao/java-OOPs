
//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

// AUTOMATIC PROMOTION

class Test{
    void show(int a){ //THIS METHOD COLL BECOUSE AUTOMATIC PROMOTION
        System.out.println("INT METHOD");
    }
    void show(String a){ 
        System.out.println("STRING METHOD");
    }
}
public class o_Automatic_promotion {
    public static void main(String[] args) {
        Test A=new Test();


        A.show('a'); //COLL THE METHOD 1

        
    }
    
}
