import java.util.*;
public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a: ");
        String a = sc.nextLine();
        int x = Integer.parseInt(a);
        System.out.println(x);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Code executed");
        }
        sc.close();
    }
}
