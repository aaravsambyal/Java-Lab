class MyThread extends Thread{
    private String threadName;
     MyThread(String s){
        threadName = s;
    }
   public void run(){
     for(int i=1; i<6; i++){
            System.out.println("Thread: "+threadName+" Count: "+i);
        }
        
    }
}
public class problem1{
    public static void main(String[] args){
        MyThread thr1 = new MyThread("abc");
        thr1.start();
    }

}
