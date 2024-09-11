package ExceptionHanding;

class BankingException extends Exception{
    public BankingException(String message) {
        super(message);
    }
}
class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws BankingException {
        if(amount> balance){
            throw new BankingException("Insufficient Funds!");
        }
        else {
            balance-=amount;
            System.out.println("Withdraw Successful!");
        }
    }
}
public class BankingWithCustomExceptions {
    public static void main(String[] arg){
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
        }catch (BankingException e){
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
        }
        try {
            account.withdraw(500);
        }catch (BankingException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
