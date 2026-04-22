class ChildThread extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
        System.out.println(i+1);
    }
  }
}
public class problem4 {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        ct.start();
        try{
        ct.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread resumes execution");
    }
}
