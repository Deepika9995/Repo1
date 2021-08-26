import javax.money.MonetaryAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Money_Dojo_Launcher {


    public static void main(String a[]){
        EuroImplementation euroImplementation = new EuroImplementation();
        System.out.println("Enter number of EUR entries: ");
        List<Double> listOfEuros = new ArrayList<>();
        Double euroValueToBeMatched = null;
        Double euroValue = null;
        int listCapacity;
        Scanner scanner = new Scanner(System.in);
        listCapacity = scanner.nextInt();
        for(int i=0; i<listCapacity; i++){
            euroValue = scanner.nextDouble();
            listOfEuros.add(euroValue);
        }
        System.out.println("Enter the EUR value to be matched!..");
        euroValueToBeMatched = scanner.nextDouble();
        euroImplementation.getSumOfEuroObjects(euroValueToBeMatched,listOfEuros);
        System.out.println(euroImplementation.addEurosTogether(listOfEuros));
    }

}
