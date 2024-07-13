class Employee{
    private int empid;
    public void setEmpid(int eid){
        empid=eid;
    }
    public int getEmpid(){
        return empid;
    }
}
public class y_Encapsulation {
    public static void main(String[] args) {
        Employee A=new Employee();

        A.setEmpid(200);

        System.out.println(A.getEmpid());
    }
}
