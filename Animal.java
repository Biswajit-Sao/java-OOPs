
// CLASS , OBJECT AND METHODS

class Animal{ //ANIMAL IS A CLASS

    void run(){  // RUN IS A METHOD
        System.out.println("Iam raning");
    }
    public static void main(String[] args) {
        
        Animal Buzo=new Animal(); //BUZO IS A OBJECT
        
        Buzo.run(); //COLL THE METHOD USING OBJECT
        Buzo.eat(); //COLL THE METHOD USING OBJECT

        Birds tea=new Birds(); // TEA IS A OBJECT
        tea.fly();  //COLL THE METHOD USING OBJECT
    }
    void eat(){
        System.out.println("I am eating");
    }
}

class Birds{ //BIRDS IS ANATHER CLASS THAT COLL MAIN METHOD
    void fly(){ //// FLY IS A METHOD
        System.out.println("I am fly");
    }
}
