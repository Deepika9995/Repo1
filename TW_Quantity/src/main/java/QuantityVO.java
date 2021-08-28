public class QuantityVO {

    //https://www.instructables.com/How-to-Create-a-Java-Unit-Converter/

    Double quantityOne;
    Double quantityTwo;
    Double result;
    String unitOne;
    String unitTwo;
    String unitResult;

    enum units{
        MtoCM(100.0), CMtoKM(10000.0), MtoKM(1000.0);

        // declaring private variable for getting values
        private Double unitConversionFactor;

        // getter method
        public Double getUnitConversionFactor(){
            return this.unitConversionFactor;
        }

        // enum constructor
        private units(double unitConversionFactor) {
            this.unitConversionFactor = unitConversionFactor;
        }
    }

    public Double getQuantityOne() {
        return quantityOne;
    }

    public void setQuantityOne(Double quantityOne) {
        this.quantityOne = quantityOne;
    }

    public Double getQuantityTwo() {
        return quantityTwo;
    }

    public void setQuantityTwo(Double quantityTwo) {
        this.quantityTwo = quantityTwo;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getUnitOne() {
        return unitOne;
    }

    public void setUnitOne(String unitOne) {
        this.unitOne = unitOne;
    }

    public String getUnitTwo() {
        return unitTwo;
    }

    public void setUnitTwo(String unitTwo) {
        this.unitTwo = unitTwo;
    }

    public String getUnitResult() {
        return unitResult;
    }

    public void setUnitResult(String unitResult) {
        this.unitResult = unitResult;
    }
}
