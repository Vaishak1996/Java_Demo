package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Open_YT_Podtest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver wd=new ChromeDriver();
        wd.get("https://youtube.com");

        //verifying text on Text on Search bar(search)
     //  WebElement ww= wd.findElement(By.xpath("//input[@aria-label='Search']"));
        Thread.sleep(10000);
        WebElement we=wd.findElement(By.xpath("//ytd-searchbox[@id='search']//input[@placeholder='Search']"));
        System.out.println(we);

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.findElement(By.xpath("//input[@name='search_query']")).sendKeys("podtest");
        wd.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
       // wd.findElement(By.xpath("//div[@id='text-container']/yt-formatted-string[text()='PodTest']")).click();
        wd.findElement(By.xpath("//a[@id='main-link'][1]//yt-formatted-string[text()='PodTest']")).click();
    }
}
