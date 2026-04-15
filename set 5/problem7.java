import java.util.*;
class InvalidAge extends Exception{
    InvalidAge(String m){
        super(m);
    }
}
class Age{
 void checkAge(int age) throws InvalidAge{
    if(age < 18){
        throw new InvalidAge("Not eligible");
    }
    else{
        System.out.println("Age: "+age);
    }
} 
}
public class problem7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Age a = new Age();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        try{
            a.checkAge(age);
        }
        catch(InvalidAge e){
            System.out.println(e.getMessage());
        }
    }

}
