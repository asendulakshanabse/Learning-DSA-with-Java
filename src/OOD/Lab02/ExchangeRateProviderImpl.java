package OOD.Lab02;

import java.util.Random;

class ExchangeRateProviderImpl implements ExchangeRateProvider{
    Random random = new Random();
    double exchangeRate = 0.5 + (random.nextDouble() * 0.5);

    public double getRate(String fromCurrency, String toCurrency) {
        return 0;
    }

}
