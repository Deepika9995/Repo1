import java.util.Currency;

public class TransactionImplementation extends Transaction{
    double totalMoney;

    @Override
     double putMoneyIn(Currency currencyCode, Double amount, Money money) {
        String currencyType = currencyCode.getCurrencyCode();
        if(currencyType.equalsIgnoreCase("INR")){
            money.totalAmountOfMoneyInINR += amount;
            money.setTotalAmountOfMoneyInINR(money.totalAmountOfMoneyInINR);
            totalMoney += money.getTotalAmountOfMoneyInINR();
        }
        else if(currencyType.equalsIgnoreCase("USD")){
            money.totalAmountOfMoneyInUSD += amount;
            money.setTotalAmountOfMoneyInUSD(money.totalAmountOfMoneyInUSD);
            totalMoney += money.getTotalAmountOfMoneyInUSD();
        }
        return totalMoney;
    }

    @Override
    double takeMoneyOut(Currency currencyCode, Double amount, Money money) {
        String currencyType = currencyCode.getCurrencyCode();
        if(currencyType.equalsIgnoreCase("INR")){
            money.totalAmountOfMoneyInINR -= amount;
            money.setTotalAmountOfMoneyInINR(money.totalAmountOfMoneyInINR);
            totalMoney -= money.getTotalAmountOfMoneyInUSD();
        }
        else if(currencyType.equalsIgnoreCase("USD")){
            money.totalAmountOfMoneyInUSD -= amount;
            money.setTotalAmountOfMoneyInUSD(money.totalAmountOfMoneyInUSD);
            totalMoney -= money.getTotalAmountOfMoneyInUSD();
        }
        return totalMoney;
    }

    public void knowTotalAmountOfMoneyInEachType(Money money) {
        System.out.println("Total amount of money in INR: " + money.getTotalAmountOfMoneyInINR());
        System.out.println("Total amount of money in USD: " + money.getTotalAmountOfMoneyInUSD());
    }
}
