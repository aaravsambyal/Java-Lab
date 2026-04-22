class Counter{
    int count = 0;
    public void increment(){
        for(int i = 0; i<100000; i++){
        count++; 
        }
    }
}
class MyThread extends Thread{
    Counter c = new Counter();
    public void run(){
    c.increment();
   }
}
public class problem6{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
         try{
            t1.join();
         }
         catch(InterruptedException e){
            System.out.println(e.getMessage());
         }
         
    }
}
