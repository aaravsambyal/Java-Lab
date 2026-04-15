import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        sc.nextLine();
        int c;
        try{
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}
