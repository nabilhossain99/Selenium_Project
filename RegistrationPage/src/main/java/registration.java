import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class registration {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/samplepagetest/");
        driver.manage().window().maximize(); // Maximize the current website
        WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"wpcf7-f2598-p2599-o1\"]/form/p/span/input"));
        uploadElement.sendKeys("G:\\Files\\1.pdf");
        WebElement name= driver.findElement(By.id("g2599-name"));
        name.sendKeys("MD Nabil Hossan");
        Thread.sleep(2000);
        WebElement email= driver.findElement(By.id("g2599-email"));
        email.sendKeys("nabilhossai@gmail.com");
        Thread.sleep(2000);
        WebElement website= driver.findElement(By.id("g2599-website"));
        website.sendKeys("https://www.techlandbd.com/");
        Thread.sleep(2000);

        WebElement dropdownElement = driver.findElement(By.id("g2599-experienceinyears"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("1-3");

        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[2]"));
        checkbox.click();

        WebElement radioButton=driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[4]"));
        radioButton.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement alertButton=driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/button"));
        alertButton.click();

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert al = driver.switchTo().alert();
        alert.accept();


        WebElement commentBox=driver.findElement(By.id("contact-form-comment-g2599-comment"));
        commentBox.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        Thread.sleep(2000);
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/p[3]/button"));
        submit.click();



       driver.close();





    }
}
