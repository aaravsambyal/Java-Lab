public class problem6 {
    public static void main(String[] args) {
        class Person{
            String name;
            int age;
            Person(String n, int a){
                name = n;
                age = a;
            }
        }
        class Patient extends Person{
            String disease;
            String doctorAssigned;
            Patient(String n, int a, String d, String doc){
                super(n,a);
                disease = d;
                doctorAssigned = doc; 
            }
            void display(){
                System.out.println("Name: "+name+" Age: "+age+" Disease: "+disease+" Doctor: "+doctorAssigned);
            }
        }
        Patient p = new Patient("abc", 20, "TB", "Mike");
        p.display();
    }
}
