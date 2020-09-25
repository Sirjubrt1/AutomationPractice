package scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import pom.HomePage;

public class TestScripts extends BaseTest{

@Test(enabled=true)
public void AutomationPractice() throws InterruptedException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	BasePage.verifyTitle("My account - My Store");
	p.clickWomen();
	p.clickfadedShortSleev();
    p.addToCart();
    Thread.sleep(2000);
    p.proBtn();
    p.sriGaj();
    p.signOut();
    
}
@Test(enabled=true)
public void DressShopping() throws InterruptedException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	BasePage.verifyTitle("My account - My Store");
    p.dressMenu();
    Thread.sleep(2000);
    p.clickPrintDress();
    JavascriptExecutor j = (JavascriptExecutor)driver;
   	j.executeScript("window.scrollBy(0,500)");
    p.plusSign();
    p.addCart();
    Thread.sleep(2000);
    p.proChkOut();
    p.proChkTwo();
    p.proChkAddr();
    p.chkBox();
    p.proChkShi();
    p.payBank();
    p.confOrd();
    p.logOut();
    }
  
   

@Test(enabled=true)
public void BlouseShopping() throws InterruptedException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	p.setSearchBox("Blouse");
	p.searchClick();
	p.clickBlouse();
	p.addCart();
	Thread.sleep(2000);
	p.proChkOut();
	p.proChkTwo();
	p.proChkAddr();
	p.chkBox();
	p.proChkShi();
	p.payBank();
	p.confOrd();
	p.logOut();
}
@Test(enabled=true)
public void EveningDresses() throws InterruptedException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	p.setSearchBox("Evening Dresses");
	p.searchClick();
    p.clickPrintDress();
    p.addCart();
    Thread.sleep(2000);
    p.contShopp();
    driver.navigate().back();
    Thread.sleep(2000);
    p.clickPrintDress();
    p.addCart();
    Thread.sleep(2000);
	p.proChkOut();
	p.proChkTwo();
	p.proChkAddr();
	p.chkBox();
	p.proChkShi();
	p.payBank();
	p.confOrd();
	p.logOut();
    
}
@Test(enabled=true)
public void MouseHover() throws InterruptedException, AWTException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	Actions action=new Actions(driver);
	WebElement Wom = driver.findElement(By.xpath("//a[@title='Women']"));
	action.moveToElement(Wom).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
	p.shortSleev();
	p.selSize();
	Thread.sleep(2000);
	p.addCart();
	Thread.sleep(2000);
	p.proChkOut();
	p.proChkTwo();
	p.proChkAddr();
	p.chkBox();
	p.proChkShi();
	p.payBank();
	p.confOrd();
	p.logOut();
	
}
@Test(enabled=true)
public void MouseHoverTwo() throws InterruptedException, AWTException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	Actions action=new Actions(driver);
	WebElement Dre=driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	action.moveToElement(Dre).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")).click();
	p.clickPrintDress();
	p.selSizeL();
	Thread.sleep(2000);
	p.addCart();
	Thread.sleep(2000);
	p.proChkOut();
	p.proChkTwo();
	p.proChkAddr();
	p.chkBox();
	p.proChkShi();
	p.payBank();
	p.confOrd();
	p.logOut();
	
	
}
@Test(enabled=true)
public void MouseHoverThree() throws InterruptedException, AWTException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	Actions action=new Actions(driver);
	WebElement Wom = driver.findElement(By.xpath("//a[@title='Women']"));
	action.moveToElement(Wom).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Blouses']")).click();
	p.clickBlouse();
	p.selSizeL();
	Thread.sleep(2000);
	p.addCart();
	Thread.sleep(2000);
	p.proChkOut();
	p.proChkTwo();
	p.proChkAddr();
	p.chkBox();
	p.proChkShi();
	p.payByCheck();
	p.confOrd();
	p.logOut();
	
}
@Test(enabled=true)
public void MouseHoverFour() throws InterruptedException{
	HomePage p=new HomePage(driver);
	p.clickSignin();
	p.setUserName("sirjubrt1@gmail.com");
	p.setPwd("Salina@123");
	p.clickLogin();
	Actions action=new Actions(driver);
	WebElement Wom = driver.findElement(By.xpath("//a[@title='Women']"));
	action.moveToElement(Wom).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]")).click();
	Thread.sleep(2000);
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,600)");
	Thread.sleep(2000);
	p.printSumDre1();
	p.plusSign();
	p.addCart();
	Thread.sleep(2000);
	p.proChkOut();
	p.proChkTwo();
	p.proChkAddr();
	p.chkBox();
	p.proChkShi();
	p.payByCheck();
	p.confOrd();
	p.logOut();
	
	
}

}
