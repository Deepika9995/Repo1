import java.util.Currency;
import java.util.Scanner;

public class WalletLauncher {

    public  void testMethod(){}

    public static void main(String args[]){
        launchWallet();
    }

    public static void launchWallet(){
        int selectOption;
        String currencyType;
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        Money money = new Money();
        while(b) {
            System.out.println("Wallet");
            System.out.println("I want to," + "\n" + "1. Put money in" + "\t" + "2. Take money out" + "\t" + "3. Know total amount of money" + "\t" + "4. Know value in preferred currency type");
            selectOption = scanner.nextInt();
            if (selectOption == 1) {
                System.out.println("Put money in");
                money.getMonetaryDetails(selectOption);
            } else if (selectOption == 2) {
                System.out.println("Take money out");
                money.getMonetaryDetails(selectOption);
            } else if (selectOption == 3) {
                System.out.println("Total amount of money in each currency type: ");
                money.getMonetaryDetails(selectOption);
            } else if(selectOption == 4){
                System.out.println("Enter preferred currency type: ");
                currencyType = scanner.next();
                double totalAmount = money.getTotalMoneyInWallet(currencyType);
                System.out.println(totalAmount);
            } else {
                System.out.println("Enter valid option (1 - 4)");
                b = false;
            }
        }
    }


}
