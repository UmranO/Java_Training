package day18_garbageCollection;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $"+balance);
    }

    public void deposit(double amount){                              //must have info for this () is amount

        if(amount < 1){
            System.out.println("Insufficient deposit amount: "+amount);
            return;                                                  //If amount is invalid (0 or -ve) exit the method
        }

        System.out.println("Depositing $"+amount +" to "+accountHolder);
        balance += amount;
    }

    public void withdraw(double amount){                              //must have info for this () is amount

        if(amount > balance){
            System.out.println("Insufficient withdraw amount: "+amount);
            return;                                                   //We should make sure that the amount is == or <
        }                                                             //than the balance. If it is> balance exit the()


        System.out.println("Withdrawing $"+amount +" from "+accountHolder);
        balance -= amount;
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