package day18_garbageCollection;
public class WarmUpTasks_UO {
    public static void main(String[] args) {
//----Test-----------------------------------------------------------------------------------------------------

//----Test Pizza_UO-------------------------------------
        Pizza_UO pizza=new Pizza_UO();
        pizza.setInfo('L',2,3);
        System.out.println(pizza);


//----Test BankAccount_UO------------------------------
        BankAccount_UO account=new BankAccount_UO();

        account.setInfo("UO",45618431387613l,10000.00);
        System.out.println(account);
        account.checkBalance();
        System.out.println(account.deposit(100));
        System.out.println(account.withdraw(200.0));

    }

}