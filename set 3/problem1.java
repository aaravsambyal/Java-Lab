public class problem1 {
    public static void main(String[] args) {
        class Person {
            String name;
            int age;

            Person(String n, int a) {
                name = n;
                age = a;
            }
        }
        class Student extends Person {
            int rollno;
            String course;
            Student(String n, int a,int r, String c){
                super(n,a);
                rollno = r;
                course = c;
            }
            void display(){
                System.out.println("Name: "+name+" Age: "+age+" Rollno: "+rollno+" Course: "+course);
            }
        }
        Student s = new Student("abc", 20, 15, "cse");
        s.display();
    }
}