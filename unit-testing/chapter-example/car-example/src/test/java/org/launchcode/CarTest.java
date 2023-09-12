package org.launchcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank() {
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }



    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
   @Test
    public void testInitialGasTankFalse()
    {
        assertFalse(test_car.getGasTankLevel()==0);
    }
    @Test
    public void testInitialGasTankTrue()
    {
        assertTrue(test_car.getGasTankLevel()==10);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}