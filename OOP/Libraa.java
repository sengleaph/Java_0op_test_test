package OOP;

class Account{
    private double balance;
    void withdraw (double amount ){
        if (amount <= this.balance){

            balance -= amount;
        }
        else {
            System.out.println("Insufficient funt !!");
        }
    }
    void deposit (double amount){
        balance += amount;
    }
    public double getBalance(){
        return this.balance;
    }
    void setBalance( double balance){
        this.balance = balance;
    }
}
class SavingAccount extends Account{
    private float interestRates;
//    getter and setter
    public float getInterestRates() {
        return this.interestRates;
    }
    public void setInterestRates(float interestRates){
        this.interestRates = interestRates;
    }
    double calculateInterest(){
        return getBalance() * (interestRates/100);
    }
}
    class CreditCardAccount extends Account{
        private float interestRate;
        private float creditCardLimit;
        double calculateInterest(){
        return getBalance()*(interestRate/100);
    }
        @Override
    void withdraw (double amount){
        if (amount <= creditCardLimit){
            super.withdraw(amount);
        }else {
            System.err.println("Amount exceed the credit card limit!! ");
        }
    }
    void setCreditCardLimit(float creditCardLimit){
            this.creditCardLimit = creditCardLimit;
    }
}
public class Libraa {
    public static void main(String[] args) {
//        Account account = new Account();
//        SavingAccount savingAccount = new SavingAccount();
//        savingAccount.deposit(2000);
//        savingAccount.setInterestRates(1500);
//        System.out.println("The balance in the bank is : " +savingAccount.calculateInterest() + "$");
//        System.out.println("Original account is : " +savingAccount.getBalance() + "$");
//        System.out.println("Total money is  : " +(savingAccount.getBalance() + savingAccount.calculateInterest())+ "$");
//        savingAccount.deposit(savingAccount.calculateInterest());
//
//        savingAccount.withdraw(200);
//        System.out.println("Money left  : " +savingAccount.getBalance()+  "$");

        CreditCardAccount creditCardAccount = new CreditCardAccount();
        creditCardAccount.deposit(100);
        creditCardAccount.setCreditCardLimit(50);
        creditCardAccount.withdraw(555);

        System.out.println("Original account is : " +creditCardAccount.getBalance() + "$");

    }
}
