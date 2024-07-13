
//INSITIAIZ A OBJECT IN REFESENCE VAREBLE

class Animal{
    String color;
    int age;
}

public class a_Refesence_varebile {
    public static void main(String[] args) {
        Animal buzo=new Animal();
        buzo.color="black";
        buzo.age=10;
        System.out.println("Color: "+buzo.color+"\n Age:"+buzo.age);
    }
}
