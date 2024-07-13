//COMPILE TIME POLYMORPHISM (STATIC POLYMORPHISM)

//METHOD OVERLOODING

//PROB
//CAN WE OVERLOAD JAVA MAIN() METHOD 


public class n_polymorphism {
    public static void main(String[] args) {
        System.out.println("I am 1st main method");
        n_polymorphism A=new n_polymorphism();
        A.main();
    }
    public static void main() {
        System.out.println("I am 2nd main method");
    }
}
