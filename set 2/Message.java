import java.util.Scanner;

public class Message {
    String text;

    void getMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        text = sc.nextLine();
        sc.close();
    }
    void showLength(){
        System.out.println("Length of string: "+ text.length());
    }
    void upperCase(){
        System.out.println("Uppercase: "+ text.toUpperCase());
    }
    public static void main(String[] args) {
        Message m1 = new Message();
        m1.getMessage();
        m1.showLength();
        m1.upperCase();
    }
}
