class MyThread extends Thread{
    int count = 1;
    public void run(){
        for(int i = 0; i<10; i++){
        System.out.println("awake "+"Count: "+count);
        count++;
        try{
            sleep(1000);
            System.out.println("going to sleep");
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }   
    }
  }
}
public class problem3 {
    public static void main(String[] args) {
        MyThread thr1 = new MyThread();
        MyThread thr2 = new MyThread();
        thr1.start();
        thr2.start();
        
    }
}
