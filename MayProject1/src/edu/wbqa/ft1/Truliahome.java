package edu.wbqa.ft1;

​​import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Truliah


ome {
    
    WebDriver driver;
    
    public void TruliaHomePage(WebDriver driver){
        this.driver= driver;
    }
//test for Action api ie mouseover    
public List<String>    buyCheck(){
    driver.manage().window().maximize();
    WebElement buyLink= driver.findElement(By.xpath("//span[contains(text(),'Buy')][1]"));
    Actions A= new Actions(driver);
    A.moveToElement(buyLink).build().perform();
    List<WebElement> subcategory= driver.findElements(By.xpath("(//ul[@class='dropdownList'])[1]/li/span"));
    
    Iterator it= subcategory.iterator();
    List<String> allText= new ArrayList();
    while(it.hasNext()){
        WebElement temp = (WebElement)it.next();
        allText.add(temp.getText());
        
    }
    return allText;
}
    
}