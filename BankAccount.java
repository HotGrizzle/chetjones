
public class BankAccount {

    private int nAccountNumber;
    private static int nNextAccountNumber = 12345;
    private double dBalance;
    private double dMonthlyInterestRate;

    public BankAccount() {
        nAccountNumber = nNextAccountNumber;
        nNextAccountNumber++;
    }

    public BankAccount(double dStartBalance, double dIntRate) {
        nAccountNumber = nNextAccountNumber;
        nNextAccountNumber++;
        dBalance = dStartBalance;
        dMonthlyInterestRate = dIntRate;
    }

    public int getAccountNumber() {
        return nAccountNumber;
    }

    public double getBalance() {
        return dBalance;
    }

    public double getMonthlyInterestRate() {
        return dMonthlyInterestRate;
    }

    public void setMonthlyInterestRate(double dRate) {
        dMonthlyInterestRate = dRate;
    }

    public static int getNextAccountNumber() {
        return nNextAccountNumber;
    }

    public void printBankInfo() {
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Account balance: $" + getBalance());
        System.out.println("Monthly interest: $" + monthlyInterest());
    }

    public void makeDeposit(double dDepositAmt) {
        dBalance += dDepositAmt;
    }

    public void makeWithdrawal(double dWithdrawalAmt) {
        if (dWithdrawalAmt < dBalance) {
            dBalance -= dWithdrawalAmt;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient funds. Withdrawal not made.");
        }
    }

    public double monthlyInterest() {
        return dMonthlyInterestRate * dBalance;
    }

}
