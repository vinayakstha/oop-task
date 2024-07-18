
public class secd2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.AccountNo = "B1";
        b1.AccountHolderName = "Sameer";

        b1.deposit(2000);
        b1.checkBalance();

        b1.withdraw(200);
        b1.checkBalance();
    }
}
class BankAccount{
    String AccountNo;
    String AccountHolderName;
    double balance;

    void deposit(double depositAmount){
        balance +=depositAmount;
    }
    void withdraw(double withdrawAmount){

        if(withdrawAmount<=balance){
            balance -=withdrawAmount;
        }
        else{
            System.out.println("Can't withdraw Insufficient balance");
        }
    }
    void checkBalance(){
        System.out.println("Your current balance is "+balance);
    }
}