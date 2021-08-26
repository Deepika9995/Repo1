import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import java.util.ArrayList;
import java.util.List;

public class EuroImplementationTest {

@Test
public void initialTest(){
    Assert.fail("Start Implementing now!..");
}


@Test
public void testAddEurosTogether(){
    EuroImplementation euroImplementationTest = new EuroImplementation();
    List<Double> euroValueList = new ArrayList<>();
    euroValueList.add(2.0);
    euroValueList.add(5.0);
    euroValueList.add(7.0);
    euroValueList.add(10.0);
    euroValueList.add(10.0);
    euroValueList.add(8.0);
    euroValueList.add(8.0);
    Assert.assertEquals( 50.0, euroImplementationTest.addEurosTogether(euroValueList), 0);
}

@Test
public void testEuroMatch(){
    EuroImplementation euroImplementationTest = new EuroImplementation();
    List<Double> euroValueList = new ArrayList<>();
    euroValueList.add(2.0);
    euroValueList.add(5.0);
    euroValueList.add(7.0);
    euroValueList.add(10.0);
    euroValueList.add(10.0);
    euroValueList.add(8.0);
    euroValueList.add(8.0);
    Assert.assertEquals(null, euroImplementationTest.getSumOfEuroObjects(18.0, euroValueList));
}

}
