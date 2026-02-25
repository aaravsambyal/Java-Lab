import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class problem5 {
    public static void main(String[] args){
        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
