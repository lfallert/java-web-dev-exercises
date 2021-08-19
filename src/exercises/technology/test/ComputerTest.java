package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;


public class ComputerTest {

    Computer test_laptop;
    Computer test_smartphone;

    @Before
    public void createLaptopObject() {
        test_laptop = new Laptop(2015, "Asus", "midnight black", 16);
        test_smartphone = new SmartPhone(2019, "Apple", "black", "Verizon Wireless");
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void inheritsSuperInSmartPhoneConstructor() {
        assertEquals(2019, test_smartphone.getYear(), .001);
    }

    @Test
    public void inheritsSuperInLaptopConstructor() {
        assertEquals("Asus", test_laptop.getBrand());
    }

    @Test
    public void verifiesPrintMethod() {
        assertEquals("This device is a Asus", test_laptop.printBrand());
    }


    // ask why it doesn't work to make a new computer object with laptop class
    @Test
    public void testAddRamMethod() {
        Laptop myLaptop = new Laptop (2016, "Dell", "steel grey", 16);
        assertEquals(20, myLaptop.addRam(4), .001);
    }

    @Test
    public void checksProviderMethod() {
        SmartPhone mySmartPhone = new SmartPhone(2019, "Apple", "black", "Verizon Wireless");
        assertEquals("Your provider is Verizon Wireless", mySmartPhone.checkProvider());
    }
}
