import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class problem7 {
    public static void main(String[] args){
        Integer[] arr = {2,1,6,7,10,8};
        List <Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
