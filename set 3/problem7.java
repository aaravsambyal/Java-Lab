public class problem7 {
    public static void main(String[] args) {
        class Student{
            String name;
            int marks;
            Student(String n, int m){
                name = n;
                marks = m;
            }
        }
        class Result extends Student{
            char grade;
            Result(String n, int m){
                super(n,m);
                
            if(marks > 90 && marks <= 100){
                grade = 'A';
            }
            else if(marks > 80 && marks <= 90){
                grade = 'B';
            }
            else if(marks > 50 && marks <= 80){
                grade = 'C';
            }
            else{
                grade = 'F';
            }
            }
            void display(){
                System.out.println("Name: "+name+" Marks: "+marks+" Grade: "+grade);
            }
}
        Result s = new Result("abc", 80);
        s.display();
    }
}
