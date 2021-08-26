import java.util.Currency;

abstract class Transaction {
    abstract double putMoneyIn(Currency currencyCode, Double amount, Money money);
    abstract double takeMoneyOut(Currency currencyCode, Double amount, Money money);
}
