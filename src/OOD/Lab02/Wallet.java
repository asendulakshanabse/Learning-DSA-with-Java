package OOD.Lab02;

abstract public class Wallet {
    private double walletId;
    private double balance;


    public double getWalletId() {
        return walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setWalletId(double walletId) {
        this.walletId = walletId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    abstract public double loadMoney(double amount);

    abstract public double spendMoney(double amount);

    abstract public double displayWalletInfo();

}
