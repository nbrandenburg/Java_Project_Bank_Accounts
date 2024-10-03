//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            Account[] accounts = new Account[4];

            accounts[0] = new CheckingAccount(101, 750);
            accounts[1] = new CheckingAccount(102, 1200);
            accounts[2] = new SavingsAccount(201, 1000);
            accounts[3] = new SavingsAccount(202, 2500);

            //Deposit and Withdrawal for account[0]
            accounts[0].deposit(100);
            accounts[0].withdraw(50);
            System.out.println(accounts[0].toString());

            //Deposit and Withdrawal for account[1]
            accounts[1].deposit(100);
            accounts[1].withdraw(50);
            System.out.println(accounts[1].toString());

            //Deposit, Withdrawal for account[2]
            accounts[2].deposit(100);
            accounts[2].withdraw(50);
            System.out.println(accounts[2].toString());

            //Deposit, Withdrawal for account[3]
            accounts[3].deposit(100);
            accounts[3].withdraw(50);
            System.out.println(accounts[3].toString());

        } catch (Exception e) {

        }
    }
}