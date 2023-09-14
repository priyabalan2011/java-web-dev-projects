package technology.tests;

import org.junit.Before;
import org.testng.annotations.Test;
import technology.main.Laptop;

import static org.testng.Assert.assertEquals;

public class LaptopTest {
    Laptop  myLaptop  = new Laptop(400,300,2021,"MAC");
    @Before
    public void beforeTests()
    {
        myLaptop  = new Laptop(400,300,2021,"MAC");
        System.out.println("Hello");
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    @Test
    public void constructorSetsheightvalueTest()
    {

        assertEquals(400,this.myLaptop.getScreenHeight());

    }
    @Test
    public void constructorSetsWidthvalueTest()
    {
        assertEquals(300,this.myLaptop.getScreenWidth());
    }
    @Test
    public void constructorSetsManufacturervalueTest()
    {
        assertEquals(2021,this.myLaptop.getManufactureyear());
    }

    @Test
    public void constructorSetsMakevalueTest()
    {
        assertEquals("MAC",this.myLaptop.getMake());
    }

}
