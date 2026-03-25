public class problem2 {
    public static void main(String[] args){
        class Employee{
            String name;
            double baseSalary;
            Employee(String n, double s){
                name = n;
                baseSalary = s;
            }
        }
        class Manager extends Employee{
            double bonus;
            Manager(String n, double s, double b){
                super(n,s);
                bonus = b;
            }
            double calculateSalary(){
                return baseSalary+bonus;
            }
            void display(){
                System.out.println("Total Salary: "+calculateSalary());
            }
        }
        Manager m = new Manager("abc", 40000, 5000);
        m.display();
    }
}
