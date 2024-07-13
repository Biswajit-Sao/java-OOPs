//INSITIAIZ A OBJECT IN USING METHOD

class Animal{
    String color;
    int age;

    void inltobj(String a , int b){ //INSITIAIZ A OBJECT
        color=a;
        age=b;
    }
    void display(){
        System.out.println("Color:"+color+"\n Age: "+age);
    }
}

public class b_using_method {
    public static void main(String[] args) {
        Animal buzo=new Animal();
        buzo.inltobj("black", 10); // INPUT THE OBJECT
        buzo.display(); //PRINT THE OBJECT
    }
}

