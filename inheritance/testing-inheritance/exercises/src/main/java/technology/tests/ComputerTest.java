package technology.tests;


import org.junit.Before;
import org.testng.annotations.Test;
import technology.main.Computer;

import static org.testng.Assert.assertEquals;

public class ComputerTest {
    Computer  myComputer  = new Computer(400,300,2021);;
    @Before
    public void beforeTests()
    {
        myComputer = new Computer(400,300,2021);
        System.out.println("Hello");
    }

@Test
public void emptyTest() {
    assertEquals(10,10,.001);
}
@Test
    public void constructorSetsheightvalueTest()
{

    assertEquals(400,this.myComputer.getScreenHeight());

}
    @Test
    public void constructorSetsWidthvalueTest()
    {
        assertEquals(300,this.myComputer.getScreenWidth());
    }
    @Test
    public void constructorSetsManufacturervalueTest()
    {
         assertEquals(2021,this.myComputer.getManufactureyear());
    }


}
