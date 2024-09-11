
class Account{
    private String accountNumber;
    protected double balance;

    Account(String accountNumber,double intialBalance){
        this.accountNumber = accountNumber;
        this.balance = intialBalance;
    }

    void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited : " + amount );
        displayBalance();
    }

    void withdraw(double amount){
        if (amount<=balance){
            this.balance-=amount;
            System.out.println("Withdrawl Succesfull");
            displayBalance();
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    void transferFunds(Account depositAccount,double amount){
        if (this.balance>=amount){
            withdraw(amount);
            depositAccount.deposit(amount);
            displayBalance();
            System.out.println("Transaction Successful");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    void calculatedInterest(){
        double interest;
        interest = this.balance * 5 /100;
        System.out.println(" Interest Accumulated " + interest);
    }
    void displayBalance(){
        System.out.println("Account Number : " + this.accountNumber + " Balance : " + this.balance);
    }
}

class SavingAccount extends Account{
    private double interestRate;
    SavingAccount(String accountNumber,double intialBalance,double interestRate){
        super(accountNumber,intialBalance);
        this.interestRate = interestRate;
    }
    @Override
    void calculatedInterest(){
        double interest;
        interest = balance * this.interestRate /100;
        System.out.println(" Interest Accumulated " + interest);
    }

}

class  WithdrawalAccount extends Account{
    private  double withdrawlLimit;
    WithdrawalAccount(String accountNumber,double intialBalance,double withdrawlLimit){
        super(accountNumber,intialBalance);
        this.withdrawlLimit = withdrawlLimit;
    }

    @Override
    void withdraw(double amount){
        if(amount<=balance + withdrawlLimit){
            balance-=amount;
            System.out.println("Withdrawl Succesfull");
            displayBalance();
        }
        else{
            System.out.println("Withdrawl Limit exceeded, Not Successful");
        }
    }

}
public class ProblemDemo {
    public static void main(String[] args) {
        Account a = new Account("ABC123",1000);
        Account b = new Account("DEF456",2000);
        SavingAccount c = new SavingAccount("XYZ",1000,6.5);
        SavingAccount d = new SavingAccount("PQR",1000,7.5);

        WithdrawalAccount e = new WithdrawalAccount("WER",1000,500);
//        a.displayBalance();
//        a.deposit(1000);
//        a.withdraw(1500);
//        a.withdraw(1000);
//        b.displayBalance();
//        b.calculatedInterest();
//        c.displayBalance();
//        c.calculatedInterest();
//        d.displayBalance();
//        d.calculatedInterest();
//        e.displayBalance();
//        e.withdraw(500);
//        e.withdraw(1200);
        a.transferFunds(b,500);

    }
}
