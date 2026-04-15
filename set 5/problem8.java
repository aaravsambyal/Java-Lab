class Bank{
    int amount;
    int balance = 2000;
    
    void Withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
        }
        else{
            throw new ArithmeticException("Insufficient Balance");
        }
    }
}
public class problem8{
    public static void main(String[] args){
        Bank b = new Bank();
        try{
            b.Withdraw(100);
            System.out.println(b.balance);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
