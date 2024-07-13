class A{
    int a=10;
}
class B extends A{
    int a=20;
    void show(int a){
        System.out.println(a);       //30
        System.out.println(this.a);  //20
        System.out.println(super.a); //10
    }
}
public class ab_super_keyword {
    public static void main(String[] args) {
        B b=new B();
         
        b.show(30);
    }
}
