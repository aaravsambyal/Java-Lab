class MyThread implements Runnable{
    private String threadName;
    MyThread(String s){
        threadName = s;
    }
   public void run(){
    for(int i = 1; i<6; i++){
    System.out.println("Thread: "+threadName+" Count: "+i);
   }
}
}
public class problem2 {
    public static void main(String[] args) {
        MyThread thr = new MyThread("ABC");
        thr.run();
    }
}
