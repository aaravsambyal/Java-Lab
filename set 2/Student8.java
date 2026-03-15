import java.util.Scanner;

class Student8{
    int marks;
    String name;

    void setDetails(Scanner sc){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter marks: ");
        marks = sc.nextInt();
        sc.nextLine();
    }
    void displayDetails(){
        System.out.println("Name: "+name+" Marks: "+marks);
    }
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        n = sc.nextInt();
        sc.nextLine();
        Student8[] arr = new Student8[n];
        for(int i=0; i<n; i++){
            arr[i] = new Student8();
            arr[i].setDetails(sc);
        }
        System.out.println("Student Details: ");
        for(int i=0; i<n; i++){
            arr[i].displayDetails();
        }
        sc.close();
    }
}