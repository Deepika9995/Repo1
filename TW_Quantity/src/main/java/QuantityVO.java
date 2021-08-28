public class QuantityVO {

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
}
