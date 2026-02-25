import java.util.ArrayList;
public class problem2 {
    public static void main(String[] args){
        ArrayList <Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(2);
        number.add(4);
        number.add(2);
        number.add(5);
        number.removeIf(n -> n == 2);
        for(int i = 0; i<4; i++){
            System.out.println(number.get(i));
        }

    }
}
