import java.util.ArrayList;
public class problem1 {
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList<>();
        list.add("John");
        list.add("Adam");
        list.add("Mark");
        list.add("Bill");
        list.add("George");
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}
