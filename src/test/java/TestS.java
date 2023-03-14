import org.example.HomePageSync;
import org.example.SetUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestS extends SetUpPage {

    HomePageSync homePage ;

    @BeforeMethod
    public void SetUp()
    {
        setupDriver("https://facebook.com");
        homePage = PageFactory.initElements(driver,HomePageSync.class);
    }



    @Test
    public void id() throws InterruptedException {
        homePage.FacebookEmail("abc@yahoo.com");
        homePage.FacebookPass("Abc123");
        String actual = "https://www.facebook.com/";
        Thread.sleep(3000);
        String x = driver.getCurrentUrl();
        Assert.assertEquals(actual,x);
        System.out.println(x);

    }




}
