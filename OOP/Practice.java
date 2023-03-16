//package OOP;
//
//class Account{
//    void deposit (double amount){
//
//    }
//    void withdraw(double amount){
//
//    }
//    double showBalance(){
//        return 0;
//    }
//}
//class SavingAccount extends Account{
//    double balance;
//
//    SavingAccount(){
//        balance = 0;
//
//    }
//    void deposit (double amount){
//        balance += amount;
//    }
//    void withdraw(double amount){
//        if (balance>=amount){
//            balance-=amount;
//
//        }else{
//            System.out.println("Insufficient balance ......!");
//        }
//    }
//    double showBalance(){
//        return balance;
//    }
//}
//public class Practice {
//    public static void main(String[] args) {
//        SavingAccount account = new SavingAccount();
//        account.deposit(1000);
//        account.withdraw(50);
//        System.out.println("balance .... : " +account.showBalance() +"$");
//    }
//}
