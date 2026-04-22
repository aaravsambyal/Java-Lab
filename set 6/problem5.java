class MyThread extends Thread{
    private String threadName;
    MyThread(String s){
        threadName = s;
    }
    public void run(){
        System.out.println(threadName);
    }
}
public class problem5 {
    public static void main(String[] args){
        MyThread t1 = new MyThread("Low");
        MyThread t2 = new MyThread("Mid");
        MyThread t3 = new MyThread("High");
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
    }
}
