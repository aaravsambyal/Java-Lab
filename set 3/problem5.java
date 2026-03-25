public class problem5 {
    public static void main(String[] args) {
        class Account{
            int accNo;
            double balance;
            Account(int a, double b){
                accNo = a;
                balance = b;
            }
        }
        class SavingsAccount extends Account{
            int interestRate;
            SavingsAccount(int a, double b, int i){
                super(a,b);
                interestRate = i;
            }
            double calculate(){
                return balance*interestRate/100;
            }
            void display(){
                System.out.println("Interest: "+calculate());
            }
        }
        SavingsAccount a1 = new SavingsAccount(45325674, 50000, 5);
        a1.display();
    }
}
