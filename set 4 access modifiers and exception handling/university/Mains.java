public class Mains {
    public static void main(String[] args) {
        Result result = new Result(60);
        System.out.println("Marks: "+result.getMarks());

        Admin a = new Admin();
        a.updateMarks(result,70);
        System.out.println("Updated Marks: "+result.getMarks());

    }
}
