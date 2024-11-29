package OOD.Lab02;

public class WalletImpl extends Wallet{

    @Override
    public double loadMoney(double amount) {
        return getBalance() + amount;
    }

    @Override
    public double spendMoney(double amount) {
        return getBalance() - amount;
    }

    @Override
    public double displayWalletInfo() {
        return getBalance();
    }

    public double convertFunds(double amount, String fromCurrency, String toCurrency, ExchangeRateProvider provider) {
        return 0;
    }
}
