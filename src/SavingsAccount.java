public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(){
        super(0, 500);
    }

    public SavingsAccount(int id, double balance){
        super(id, balance);
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    @Override
    public void withdraw(double amount){
        try{
            if((getBalance() - amount) < 500)
                throw new NoSufficientFundsException();
            else
                setBalance(getBalance() - amount);
        } catch (NoSufficientFundsException e) {
            e.printStackTrace();
        }
    }

    public void addInterest(){
        this.setBalance((getBalance() * (1 + getInterestRate())));
    }

    @Override
    public String toString(){
        return "Savings " + super.toString();
    }

}
