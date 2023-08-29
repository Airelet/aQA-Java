import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTests {
    private static WebDriver driver;

    @BeforeAll
    public static void initializeWebDriver() throws InterruptedException {
        System.setProperty("web.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soltech.com");

        Thread.sleep(7500);
        driver.findElement(By.xpath("//button[@data-dismiss='modal' and @aria-label='Close']")).click();

        WebElement shopButton = driver.findElement(By.xpath("//button[text()='Continue']"));
        shopButton.click();
    }

    @BeforeEach
    public void dismissModuleWindows() {
        driver.get("https://soltech.com");
    }

    @Test
    public void addingItemsToCheckout() throws InterruptedException {

        driver.findElement(By.xpath("//label[@for='mega-shop']")).click();
        Assertions.assertTrue(driver.getTitle().contains("Shop All Soltech Products"));
        driver.findElements(By.xpath("//div[@class='product-grid']/child::div")).get(1).click();

        WebElement price = driver.findElement(By.xpath("//div[@class='modal_price subtitle']"));
        Assertions.assertTrue(price.getText().contains("EUR"));

        driver.findElement(By.xpath("//button[@type='submit' and @data-label='Add to cart']")).click();

        Thread.sleep(1000);
        driver.findElements(By.xpath("//button[@type='submit' and @name='checkout']")).get(1).click();
        Assertions.assertTrue(driver.getTitle().contains("Checkout"));
    }

    @Test
    public void loginPage() {
        driver.findElement(By.xpath("//a[@href='/account/login']")).click();
        driver.findElement(By.id("customer_email")).sendKeys("test@test.com");
        driver.findElement(By.id("customer_password")).sendKeys("testT3$t");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assertions.assertTrue(driver.findElement(By.className("errors")).getText().contains("Incorrect"));
    }

    @AfterEach
    public void waitAfterTest() throws InterruptedException {
        Thread.sleep(3000);
    }

    @AfterAll
    public static void closeWebDriver() {
        driver.close();
    }
}
