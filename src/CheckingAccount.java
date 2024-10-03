public class CheckingAccount extends Account {
    public CheckingAccount(){
        super();
    }

    public CheckingAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void withdraw(double amount){
        try {
            if((getBalance() - amount) < 0)
                throw new NoSufficientFundsException();
            else
                setBalance(getBalance() - amount);
        } catch(NoSufficientFundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "Checking " + super.toString();
    }
}
