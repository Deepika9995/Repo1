import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.*;

public class EuroImplementation {

    Euro euro = new Euro();

    public Double addEurosTogether(List<Double> euroList) {
        double totalEurosValue = 0.0;
        List<Euro> eurosVOList = createEurosVOList(euroList);
        ListIterator<Euro> eurosVOListIterator = eurosVOList.listIterator();
        while (eurosVOListIterator.hasNext()) {
            Euro euroVO = eurosVOListIterator.next();
            Double monetaryAmount = euroVO.getEuroAmount();
            totalEurosValue += monetaryAmount;
            System.out.println(totalEurosValue);
        }
        //CurrencyUnit eur = Monetary.getCurrency("EUR");
        MonetaryAmount monetaryAmountEUR = Monetary.getDefaultAmountFactory().setCurrency("EUR").setNumber(totalEurosValue).create();
        //System.out.println(monetaryAmountEUR.getNumber());
        Double d = Double.parseDouble(monetaryAmountEUR.getNumber().toString());
        return d;
    }



    public  List<Euro> createEurosVOList(List<Double> euroValues){
        List<Euro> eurosList = new ArrayList<>();
        CurrencyUnit euro = Monetary.getCurrency("EUR");
        for(int i=0; i<euroValues.size(); i++) {
            Euro e = new Euro();
            e.setEuroAmount(euroValues.get(i));
            eurosList.add(e);
        }
        return eurosList;
    }

    public Map<Euro,Euro> getSumOfEuroObjects(Double euroVO, List<Double> euroVOList) {
//      Map<Euro,Euro> matchingEuroObjects = new HashMap<>();
        Double assignEuro = null;
        Double object = null;
        Collections.sort(euroVOList);
        for(int i=0; i<euroVOList.size(); i++){
            object = euroVOList.get(i);
                for(int j = i+1; j<euroVOList.size(); j++){
                    if(object < euroVO){
                        Double x = euroVOList.get(j);
                        if((object+x) == euroVO){
                            this.euro.matchingEuroObjects.put(object,x);
                            System.out.println(this.euro.matchingEuroObjects);
                        }
                    }
                    else {break;}
                }
        }
        return null;
    }
}
