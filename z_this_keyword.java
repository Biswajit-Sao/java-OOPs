class Test{
    int i;
    void seat(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}


public class z_this_keyword {
    public static void main(String[] args) {
        Test t=new Test();
        t.seat(100);
        t.show();
    }
}
