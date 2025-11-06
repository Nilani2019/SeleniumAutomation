package Constructors;

public class BankData {

    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private int secretePin;

    public BankData(String accountNumber, String accountName, double accountBalance, int secretePin) {

       this.accountNumber = accountNumber;//variables
        this.accountName = accountName;//variables
        this.accountBalance = accountBalance;//variables
        this.secretePin = secretePin;//Variables
    }
    public void viewAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Secrete Pin: " + secretePin);
        System.out.println("1st Constructor");
    }

    public BankData(String accountNumber, String accountName){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        System.out.println("2nd Constructor");
    }
        public static void main(String[] args) {
            BankData bd = new BankData("123458421","Nivedha");
            bd.viewAccount();

        }
    }

