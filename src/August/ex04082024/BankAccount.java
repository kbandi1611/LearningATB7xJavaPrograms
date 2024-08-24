package August.ex04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    //DC
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";

    }

    //PC - 3 Arguments
    BankAccount(String bankName, int bal, String bCode) {
        this.bankName = bankName;
        this.balance = bal;
        this.bankCode = bCode;

    }

    BankAccount(String bName, int bal){
        this.bankName = bName;
        this.balance = bal;

    }

    BankAccount(String bName){
        this.bankName = bName;
    }

    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal -> " + balance);
    }
}
