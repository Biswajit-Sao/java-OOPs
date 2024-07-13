// PARAMETRIZE CONSTRUCTOR IN "this" KEYWORD 

class Employee{
    String name;
    int emp_id;
    Employee(String i ,int j){
        this.name=i;
        this.emp_id=j;
    }
}


public class f_constouctor_this_key_word_pareametrize {
    public static void main(String[] args) {
        Employee A1=new Employee("Biswajit", 231);
        System.out.println("Name: "+A1.name+"  Emp_id: "+A1.emp_id);
        Employee A2=new Employee("Suvodip", 291);
        System.out.println("Name: "+A2.name+"  Emp_id: "+A2.emp_id);
    }
}
