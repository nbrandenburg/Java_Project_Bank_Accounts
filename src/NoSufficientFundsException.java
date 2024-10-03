public class NoSufficientFundsException extends Exception {
    public NoSufficientFundsException() {
        super("insufficient balance");
    }
}
