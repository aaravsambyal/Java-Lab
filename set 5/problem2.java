public class problem2{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int a;
        try{
           a = arr[5];
           System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        

    }
}
