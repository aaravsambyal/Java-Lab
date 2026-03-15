public class Student5 {
    int total = 0, count = 0;
    int[] marks = {20, 18, 15, 19, 17};
    float average;
    
    void calculate(){
    for(int mark : marks){
        total += mark;
        count++;
    }
     average = (float)total/count;
}
    void display(){
        System.out.println("Average marks: "+ average);
    }
    public static void main(String[] args) {
        Student5 s1 = new Student5();
        s1.calculate();
        s1.display();
    }
}
