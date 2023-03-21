package day18_garbageCollection;

public class BankAccount_UO {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;              //Normal'de basta bunu set etmiyor cunku deposit/withdraw edince yapilmasi
                                           //gerek diye
    }

    public String toString() {
        return "BankAccount_UO{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println(balance);
    }
    public double deposit(double amount){
        return balance+=amount;
    }
    public double withdraw(double amount){
        return balance-=amount;
    }
}
/*
2. Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		        2. toString(): displays the full account info
		        3. checkBalance():displays the available balance
		        4. deposit(amount): increases the balance by the specified amount
		        5. withdraw(amount): decreases the balance by the specified amount
 */