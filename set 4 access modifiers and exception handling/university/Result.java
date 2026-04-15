
public class Result{
    private int marks;

    public Result(int m){
        marks = m;
    }
    public int getMarks(){
        return marks;
    }
    void updateMarks(int newMarks){
        if(newMarks >= 0 && newMarks <= 100){
            marks = newMarks;
        }
        else{
            System.out.println("Invalid Marks");
        }
    }
}
