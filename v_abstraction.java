//ABSTRACTION WITH "abstract" KEY WORDE
abstract class vehicle{ //ABSTRACTION CLASS CREAT
    abstract void start(); //ABSTRACTION METHOD
}
class car extends vehicle{
    void start(){
        System.out.println("SRART WITH KEY");
    }
}
class scooter extends vehicle{
    void start(){
        System.out.println("START WITH KICK");
    }
}
public class v_abstraction {
    public static void main(String[] args) {

        // vehicle V=new vehicle();  DON'T OBJECT CREATE      
        car c=new car();
        c.start();

        scooter s=new scooter();
        s.start();
    }
}
