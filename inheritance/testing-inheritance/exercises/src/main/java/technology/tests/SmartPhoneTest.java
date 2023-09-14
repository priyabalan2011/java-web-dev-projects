package technology.tests;

import org.testng.annotations.Test;
import technology.main.SmartPhone;

import static org.testng.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone mySmartPhone = new SmartPhone(400,300,2021,"3144841212");


    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    @Test
    public void constructorSetsheightvalueTest()
    {

        assertEquals(400,this.mySmartPhone.getScreenHeight());

    }
    @Test
    public void constructorSetsWidthvalueTest()
    {
        assertEquals(300,this.mySmartPhone.getScreenWidth());
    }
    @Test
    public void constructorSetsManufacturervalueTest()
    {
        assertEquals(2021,this.mySmartPhone.getManufactureyear());
    }

    @Test
    public void constructorSetsMakevalueTest()
    {
        assertEquals("3144841212",this.mySmartPhone.getSimNumber());
    }

}
