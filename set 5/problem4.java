import java.util.*;

public class problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c;
        try{
            System.out.println("Enter first number: ");
            String a = sc.nextLine();
            System.out.println("Enter second number");
            String b = sc.nextLine();
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            c = x/y;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}