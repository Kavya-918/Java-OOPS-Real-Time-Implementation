class BankAccount {
    private String userName;
    private double balance;
    private String accountNumber;
    public BankAccount(String userName, String accountNumber) {
        this.userName = userName;
        this.accountNumber = accountNumber;
    }
    public void setName(String name){
        this.userName = name;
    }
    public String getuserName() {
        return userName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }
}
class EncapsulationBank {
    public static void main(String[] args) {
        BankAccount user = new BankAccount("Tap Academy", "1234567890");
        System.out.println("Account Holder: " + user.getuserName());
        System.out.println("Account Number: " + user.getAccountNumber());
        
        user.deposit(200.0);
        System.out.println("New Balance: " + user.getBalance());
        
        user.withdraw(150.0);
        System.out.println("New Balance: " + user.getBalance());
        
        user.setName("Tap Institute");
        System.out.println("Account Holder Updated Name: " + user.getuserName());
        
    }
}