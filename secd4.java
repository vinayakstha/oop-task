import java.util.ArrayList;

interface Transaction {
    public double getAmount();
    public boolean isValid();
}

class DepositTransaction implements Transaction {
    private double amount;
    private double limit;

    DepositTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;

    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

class WithdrawalTransaction implements Transaction {
    private double amount;
    private double limit;

    WithdrawalTransaction(double amount, double limit) {
        this.limit = limit;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }

}

class TransferTransaction implements Transaction {
    private double amount;
    private double limit;

    TransferTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;

    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

public class FinancialTransactionSystem {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private double depositLimit;
    private double withdrawalLimit;
    private double transferLimit;

    FinancialTransactionSystem(double depositLimit, double withdrawalLimit, double transferLimit) {
        this.depositLimit = depositLimit;
        this.withdrawalLimit = withdrawalLimit;
        this.transferLimit = transferLimit;

    }

    public void addTransaction(Transaction transaction) {
        if (transaction.isValid()) {
            transactions.add(transaction);
            System.out.println("Transaction of amount " + transaction.getAmount() + " added.");
        } else {
            System.out.println("Amount: " + transaction.getAmount() + " exceeds the limit.");
        }
    }

    public static void main(String[] args) {

        FinancialTransactionSystem fts = new FinancialTransactionSystem(10000, 10000, 20000);

        Transaction deposit = new DepositTransaction(4500, fts.depositLimit);
        Transaction withdraw = new DepositTransaction(40000, fts.withdrawalLimit);
        Transaction transfer = new TransferTransaction(5000, fts.transferLimit);

        fts.addTransaction(deposit);
        fts.addTransaction(withdraw);
        fts.addTransaction(transfer);

    }
}
