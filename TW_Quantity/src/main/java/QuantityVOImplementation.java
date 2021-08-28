import java.util.Map;

public class QuantityVOImplementation {

QuantityVO quantityVO = new QuantityVO();

public boolean checkEqualityOfQuantities(String fromUnit, String toUnit, Double quantityOne, Double quantityTwo){
    boolean equalityOfQuantities = false;
    Double factor = null;
    int conversionFlag = 1;
    int sameQuantityValuesFlag = 0;

    if(fromUnit.equals(toUnit)){
        if(quantityOne == quantityTwo){
            equalityOfQuantities = true;
            sameQuantityValuesFlag = 1;
        }
    }
    else
    {
        if (!fromUnit.equals("M") && !fromUnit.equals("CM") && !fromUnit.equals("KM")) {
        System.out.println("Not a valid quantity unit!..");
    } else {
        String conversionLabel = fromUnit;
        if(toUnit.equals("CM") || toUnit.equals("KM") || toUnit.equals("M")){
                conversionLabel += "to"+toUnit;
                // M2CM  & CM2M
                if(conversionLabel.equals("MtoCM")){
                    factor = QuantityVO.units.MtoCM.getUnitConversionFactor();
                }
                else if(conversionLabel.equals("CMtoM")){
                    factor = QuantityVO.units.MtoCM.getUnitConversionFactor();
                    conversionFlag = 2;
                }
                //CM2KM & KM2CM
                if(conversionLabel.equals("CMtoKM")){
                    factor = QuantityVO.units.CMtoKM.getUnitConversionFactor();
                    conversionFlag = 2;
                }
                else if(conversionLabel.equals("KMtoCM")){
                    factor = QuantityVO.units.CMtoKM.getUnitConversionFactor();
                }
                //M2KM & KM2M
                if(conversionLabel.equals("MtoKM")){
                    factor = QuantityVO.units.MtoKM.getUnitConversionFactor();
                    conversionFlag = 2;
                }
                else if(conversionLabel.equals("KMtoM")){
                    factor = QuantityVO.units.MtoKM.getUnitConversionFactor();
                }
                if(sameQuantityValuesFlag == 0) {
                    equalityOfQuantities = this.computeQuantityValues(conversionFlag, equalityOfQuantities, quantityOne, quantityTwo, factor);
                }
            }
        }
    }
    System.out.println(equalityOfQuantities);
    return equalityOfQuantities;
}

public boolean computeQuantityValues(int conversionFlag, boolean equalityOfQuantities, Double quantityOne, Double quantityTwo, Double factor){
    boolean equalityOfValues;
    equalityOfValues = equalityOfQuantities;

    //Check if S2B or B2S Conversion
    if(conversionFlag == 1){
        if((quantityOne * factor) == quantityTwo){
            equalityOfValues = true;
        }
    }
    else if(conversionFlag == 2){
        if((quantityOne / factor) == quantityTwo){
            equalityOfValues = true;
        }
    }
    return equalityOfValues;
}

public boolean compareSumOfQuantities(Map<Double,String> quantitiesMap, Map<Double,String> resultMap) {
    boolean equalityOfSum = false;
    Double sumOfLHS;
    Double result;

    //Computing sum of LHS
    sumOfLHS = computeSum(quantitiesMap);
    System.out.println(sumOfLHS);
    //unit conversion using factor
    result = computeSum(resultMap);
    System.out.println(result);

    if(sumOfLHS.equals(result)){
        equalityOfSum = true;
        System.out.println(equalityOfSum);
    }
    return  equalityOfSum;
}

public Double computeSum(Map<Double,String> mapToBeComputed){
    Double sum = 0.0;
    //Double sumOfLHS = 0.0;
    Double quantity = 0.0;

    for (Map.Entry quantityEntry : mapToBeComputed.entrySet()){
        String unit = quantityEntry.getValue().toString();
        switch (unit){
            case "CM":
                quantity = Double.parseDouble(quantityEntry.getKey().toString()) * 1;
                sum += quantity;
                break;
            case "M":
                quantity = Double.parseDouble(quantityEntry.getKey().toString()) * 100;
                sum += quantity;
                break;
            case "KM":
                quantity = Double.parseDouble(quantityEntry.getKey().toString()) * 100000;
                sum += quantity;
                break;
            }
        }
        return sum;
    }


}

