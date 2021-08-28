import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class QuantityVOImplementationTest {

@Test
public  void testQuantityVOImplementation(){
    QuantityVOImplementation quantityVOImplementation = new QuantityVOImplementation();
    //Assert.assertEquals(true, quantityVOImplementation.checkEqualityOfQuantities("KM", "CM", 3.0,30000.0));
    Assert.assertTrue(quantityVOImplementation.checkEqualityOfQuantities("KM", "CM", 3.0,30000.0));
}

@Test
public void testCompareSumOfQuantities(){
    QuantityVOImplementation quantityVOImplementation = new QuantityVOImplementation();
    Map<Double,String> quantitiesMap = new HashMap();
    quantitiesMap.put(200.0, "CM");
    quantitiesMap.put(1.0,"KM");

    Map<Double,String> resultMap = new HashMap();
    resultMap.put(100200.0,"CM");

    //Assert.assertEquals(true, quantityVOImplementation.compareSumOfQuantities(quantitiesMap, resultMap));
    Assert.assertTrue(quantityVOImplementation.compareSumOfQuantities(quantitiesMap, resultMap));
}
}
