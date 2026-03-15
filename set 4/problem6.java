import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class problem6 {
    public static void main(String[] args){
        String[] arr = {"Aarav", "Nitan", "Aaraiz"};
        List <String> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
    }
}
