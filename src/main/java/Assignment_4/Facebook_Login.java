package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Facebook_Login {
    public static void main(String[] args) throws InterruptedException {

        WebDriver wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.get("https://www.facebook.com/");
        wd.manage().window().fullscreen();
        wd.findElement(By.xpath("//input[@name='email']")).sendKeys("#########");
        wd.findElement(By.xpath("//input[@name='pass']")).sendKeys("#########");
        wd.findElement(By.xpath("//button[@name='login']")).click();
        wd.manage().window().fullscreen();
        Thread.sleep(5000);
        wd.close();
    }
}
