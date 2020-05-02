package tautests;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumTwiTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();

    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }


    @Test
    public void openTheComPageAndCheckTheTitle2() {
        String expectedTitle = "Example Domain";
        driver.get("https://www.example.com");
        Assertions.assertEquals(expectedTitle, driver.getTitle());
    }

}
