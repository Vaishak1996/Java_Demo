package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Count_tags_TOI {

    public static void main(String[] args){

        WebDriver wd=new ChromeDriver();
        wd.get("https://timesofindia.indiatimes.com/");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
      List<WebElement> count=  wd.findElements(By.tagName("a"));
       // System.out.println(count);
     int links=count.size();
        System.out.println(links);
     /* for (int i=1;i<=links;i++){
          WebElement we=count.get(i);
          String s= we.getText();
          System.out.println(s);
      }*/

    }
}
