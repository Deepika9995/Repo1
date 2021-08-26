import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.Currency;

public class WalletCurrency {

    CurrencyUnit usd = Monetary.getCurrency("USD");
    CurrencyUnit inr = Monetary.getCurrency("INR");

    public CurrencyUnit getUsd() {
        return usd;
    }

    public void setUsd(CurrencyUnit usd) {
        this.usd = usd;
    }

    public CurrencyUnit getInr() {
        return inr;
    }

    public void setInr(CurrencyUnit inr) {
        this.inr = inr;
    }
}
