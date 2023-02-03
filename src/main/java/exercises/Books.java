package exercises;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Books {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        booksOne();
        booksTwo();
        booksThree();
        booksFour();
        booksFive();
        booksSix();
        booksSeven();
        booksEight("lly");
    }

    public static void driverSetup(String browser, String URL) {
        DriverUtils.createDriver(browser);
        driver = DriverUtils.getDriver();
        driver.get(URL);
    }

    // TODO implement all methods
    public static void booksOne() throws InterruptedException {

        driverSetup("webdriver.chrome.driver", "https://demoqa.com/books");

        Thread.sleep(2000);

        WebElement titleButtonAsc = driver.findElement(By.xpath("//div[@class='rt-th rt-resizable-header -sort-asc -cursor-pointer']"));
        titleButtonAsc.click();

        WebElement titleButtonDesc = driver.findElement(By.xpath("//div[@class='rt-th rt-resizable-header -sort-desc -cursor-pointer']"));
        titleButtonDesc.click();
        driver.navigate().refresh();
    }

    public static void booksTwo() throws InterruptedException {

        driverSetup("webdriver.chrome.driver", "https://demoqa.com/books");

        Thread.sleep(2000);

        WebElement btnPublisher = driver.findElement(By.xpath("//div[contains(text(),'Publisher')]"));
        Thread.sleep(1000);
        btnPublisher.click();
    }

    public static void booksThree() throws InterruptedException{

        driverSetup("webdriver.chrome.driver", "https://demoqa.com/books");
        Thread.sleep(2000);

        int count = 0;
        List <WebElement> books =  driver.findElements(By.cssSelector(".rt-tr-group > div > div:nth-child(3)"));
        for (WebElement book : books){
            if (book.getText().charAt(0) == 'A'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void booksFour() {

    }

    public static void booksFive() {
        // HINT: ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", 'ELEMENT');

    }

    public static void booksSix() {

    }

    public static void booksSeven() {
        // HINT: you can find one element through another. Use '.' before xpath expression

    }

    public static void booksEight(String searchQuery) throws InterruptedException {

    }


}
