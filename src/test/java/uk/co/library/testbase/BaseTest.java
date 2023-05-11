package uk.co.library.testbase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utility.Utility;


public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }
}
