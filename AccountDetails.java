class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private int balance;

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountHolderName (String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName () {
        return accountHolderName;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }

    public int getBalance () {
        return balance;
    }
}

public class AccountDetails {
    public static void main (String [] args) {
        BankAccount account1 = new BankAccount ();
        account1.setAccountNumber ("123456789");
        account1.setAccountHolderName ("Jaya Vardhan");
        account1.setBalance (5000);
        System.out.println ("Account number: " + account1.getAccountNumber());
        System.out.println ("Account holder name: " + account1.getAccountHolderName());
        System.out.println ("Account balance: " + account1.getBalance());
    }
}