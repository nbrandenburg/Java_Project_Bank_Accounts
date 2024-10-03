public class Account {
    private int id;
    private double balance;

    public Account(){
        this.balance = 0;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void deposit(double amount){
        try {
            if(amount < 0)
                throw new IllegalAmountException();
            else
                this.balance += amount;
        } catch (IllegalAmountException e) {
            e.printStackTrace();
        }
    }

    public void withdraw(double amount){

    }

    @Override
    public String toString(){
        return "Account ID: " + id + "\n\tBalance: " + balance;
    }
}
