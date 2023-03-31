package Aqil.Bootcamp3.Projects.project4;

public class bankAccount {
    String accountNumber;
    double balance;
    String accountType;
    String accountHolderName;

    public bankAccount(String accountNumber, double balance, String accountType, String accountHolderName) {
        setAccountHolderName(accountHolderName);
        setBalance(balance);
        setAccountType(accountType);
        setAccountNumber(accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName.isEmpty()) {
            throw new IllegalStateException("Account number should be a non-empty string");
        } else {
           this.accountHolderName = accountHolderName;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 10) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("false account number");
            throw new IllegalStateException("Account number should be a string of 10 digits");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalStateException("Account number should be non-negative");
        }
    }

    public void setAccountType(String accountType) {
        if (accountType.equals("checking")) {
            this.accountType = "checking";
        } else if(accountType.equals("saving")) {
            this.accountType = "saving";
        }else {
            throw new IllegalStateException("Account number should be checking or saving");
        }
    }

    public double deposit(double amount) {
        amount = balance + amount;
        return amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalStateException("InsufficientFundsException");
        } else {
            amount = balance - amount;
            System.out.println(amount);
        }
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
