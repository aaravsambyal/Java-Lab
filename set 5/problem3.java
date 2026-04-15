import java.util.*;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n = sc.nextLine();
        int x;
        try{
            x = Integer.parseInt(n);
            System.out.println(n);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
