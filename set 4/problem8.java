import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
public class problem8 {
    public static void main(String[] args){
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple"};
        List<String> words = Arrays.asList(arr);
        System.out.println(countFrequencies(words));
    
    }
}
