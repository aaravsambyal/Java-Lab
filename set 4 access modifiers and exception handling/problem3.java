public class problem3{
    public static void main(String[] args) {
       class ATM{
        private double balance;
        ATM(double b){
            balance = b;
        }
        
        public void withdraw(double amount) throws Exception{
            if(amount < 0){
                throw new Exception("amount can't be negative");
            }
            if(amount>balance){
                throw new Exception("Insufficient Balance");
            }
            amount -= balance;
            System.out.println("Withdrawal Successful! Updated Balance: "+balance);   
        }
            
    }
    ATM a = new ATM(5000);
    try{
        a.withdraw(-4);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
