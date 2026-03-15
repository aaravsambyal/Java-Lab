public class Employee {
    String name, designation;
    double salary;

    Employee(){
        name = "unknown";
        designation = "unknown";
        salary = 0;
    }
    Employee(String n, String d, double s){
        name = n;
        designation = d;
        salary = s;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("MNO", "HR", 40000);
        e1.display();
    }
}
