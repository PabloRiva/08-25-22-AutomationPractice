import Utilities.driverManager;
import org.junit.AfterClass;
import org.junit.Before;

public class baseTest {
        @Before
        public void setup(){
            driverManager.getDriver().get("https://www.saucedemo.com/");
            driverManager.getDriver().manage().window().maximize();
        }
        @AfterClass
        public static void cleanUp(){
            driverManager.getDriver().quit();
        }
}
