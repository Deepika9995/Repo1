import org.junit.Assert;
import org.junit.Test;

public class TestAreaAndPerimeter {

    @Test
    public void testInitial(){
        Assert.fail("Start..");
    }

    @Test
    public void testSquareArea(){
        FindAreaAndPerimeterImplementation findAreaAndPerimeterImplementation = new FindAreaAndPerimeterImplementation();
        Assert.assertEquals(16.0,findAreaAndPerimeterImplementation.calculateSquareArea(4.0),0);
    }

    @Test
    public void testSquarePerimeter(){
        FindAreaAndPerimeterImplementation findAreaAndPerimeterImplementation = new FindAreaAndPerimeterImplementation();
        Assert.assertEquals(24.0,findAreaAndPerimeterImplementation.calculateSquarePerimeter(6.0),0);
    }

    @Test
    public void testRectangleArea(){
        FindAreaAndPerimeterImplementation findAreaAndPerimeterImplementation = new FindAreaAndPerimeterImplementation();
        Assert.assertEquals(15.0,findAreaAndPerimeterImplementation.calculateRectangleArea(3.0, 5.0),0);
    }

    @Test
    public void testRectanglePerimeter(){
        FindAreaAndPerimeterImplementation findAreaAndPerimeterImplementation = new FindAreaAndPerimeterImplementation();
        Assert.assertEquals(16.0,findAreaAndPerimeterImplementation.calculateRectanglePerimeter(3.0, 5.0),0);
    }

}
