import java.util.*;

public class Money {

    public double totalAmountOfMoneyInUSD = 0;
    public double totalAmountOfMoneyInINR = 0;
    public double totalMoneyInWalletInINR = 0;
    public double totalMoneyInWalletInUSD = 0;
    double transactionValue = 0;

    private TransactionImplementation transactionImplementation = new TransactionImplementation();

    public void getMonetaryDetails(int option){
        Scanner scanner = new Scanner(System.in);
        String currencyType;
        double amount;
            if(option == 1 || option == 2) {
                System.out.print("Enter the currency type (INR or USD): ");
                currencyType = scanner.next();
                if (currencyType.equalsIgnoreCase("USD") || currencyType.equalsIgnoreCase("INR")) {
                    Currency currencyCode = Currency.getInstance(currencyType);
                    System.out.print("Enter the amount: ");
                    amount = scanner.nextDouble();
                    if (option == 1) {
                        transactionValue = transactionImplementation.putMoneyIn(currencyCode, amount, this);
                    } else {
                        transactionValue = transactionImplementation.takeMoneyOut(currencyCode, amount, this);
                    }
                }
                else {
                    System.out.println("Enter Valid currencyType!..");
                }
            }
            else if(option == 3){
                transactionImplementation.knowTotalAmountOfMoneyInEachType(this);
            }
            else {
                System.out.println("Enter valid transaction option");
            }
    }

    public double getTotalMoneyInWallet(String currencyType){
        double convertedAmount = 0;
        convertedAmount = this.currencyConversion(currencyType);
        return convertedAmount;
    }

    public double currencyConversion(String currencyType){
        double convertedAmount = 0;
        if(currencyType.equals("INR"))
        {
            convertedAmount = this.totalAmountOfMoneyInUSD * 70.25;
            convertedAmount += this.totalAmountOfMoneyInINR;
        }
        else if(currencyType.equals("USD"))
        {
            convertedAmount = this.totalAmountOfMoneyInINR / 70.25;
            convertedAmount += this.totalAmountOfMoneyInUSD;
        }
        return convertedAmount;
    }

    public double getTotalAmountOfMoneyInUSD() {
        return totalAmountOfMoneyInUSD;
    }

    public void setTotalAmountOfMoneyInUSD(double totalAmountOfMoneyInUSD) {
        this.totalAmountOfMoneyInUSD = totalAmountOfMoneyInUSD;
    }

    public double getTotalAmountOfMoneyInINR() {
        return totalAmountOfMoneyInINR;
    }

    public void setTotalAmountOfMoneyInINR(double totalAmountOfMoneyInINR) {
        this.totalAmountOfMoneyInINR = totalAmountOfMoneyInINR;
    }

    public double getTotalMoneyInWalletInINR() {
        return totalMoneyInWalletInINR;
    }

    public void setTotalMoneyInWalletInINR(double totalMoneyInWalletInINR) {
        this.totalMoneyInWalletInINR = totalMoneyInWalletInINR;
    }

    public double getTotalMoneyInWalletInUSD() {
        return totalMoneyInWalletInUSD;
    }

    public void setTotalMoneyInWalletInUSD(double totalMoneyInWalletInUSD) {
        this.totalMoneyInWalletInUSD = totalMoneyInWalletInUSD;
    }
}
