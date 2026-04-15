public class problem2 {
    public static void main(String[] args) {
        class BankAccount{
            private double balance;

            void withdraw(double amount){
                if(amount <= balance){
                    balance -= amount;
                }
            }
            void checkBalance(){
                System.out.println("Balance: "+balance);
            }

        }
      
            
        
    }
    
}
