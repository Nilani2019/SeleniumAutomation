package Constructors;

public class View extends BankData {//view is constructor here
    public View(String accountNumber, String accountName, double accountBalance, int secretePin) {
        super(accountName, accountNumber, accountBalance, secretePin);
    }
    public static void main(String[] args){
        View v = new View("7412425355", "Nilani", 2000.00, 2018);
        v.viewAccount();
    }
}
