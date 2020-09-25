package generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils extends BaseTest{
	public static void gSelectbyIndex(WebElement element,int n){
	Select select=new Select(element);
	select.selectByIndex(n);
	}
	public static void gSelectbyValue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);

}
	public static void gSelectbyVisibleText(WebElement element,String v){
		Select select=new Select(element);
		select.selectByVisibleText(v);

}
	public static void hover(WebDriver driver,WebElement toElement){
		Actions action=new Actions(driver);
		action.moveToElement(toElement).perform();
		
	}
	
	
	
}