public class Student {
    String name;
    int rollno;

    Student(String n, int r){
        name = n;
        rollno = r;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
    }
    public static void main(String[] args){
        Student s1 = new Student("ABC", 10);
        s1.display();
    }
    
}
