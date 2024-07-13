interface A{
    void show();

    default void abb(){
        System.out.println("METHOD_2");
    }

     static void ran(){
        System.out.println("METHOD_3");
    }
    public static final int a=10;

    default void valu(){
        System.out.println("valu is"+a);
    }
}
class w_interfaces implements A{
    public void show(){
        System.out.println("METHOD_1");
    }
    public static void main(String[] args) {
        w_interfaces B=new w_interfaces();
        B.show();
        B.abb();
        // B.ran();
        B.valu();
    }
}