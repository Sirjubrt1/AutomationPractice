package pom;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import generic.BasePage;

public class HomePage extends BasePage  {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailAddTxtBox;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pwdTxtBox;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement LoginBtn;
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women_Menu;
	@FindBy(xpath="//a[@class='product-name']")
	private WebElement fadedShortSleev;
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addToCart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proBtn;
	@FindBy(xpath="//a[@class='account']")
	private WebElement sriGaj;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signOut;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressMenu;
	@FindBy(xpath="(//a[@title='Printed Chiffon Dress'])[2]")
	private WebElement printDress;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusSign;
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addCart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proChkOut;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proChkTwo;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement proChkAddr;
	@FindBy(xpath="//div[@class='checker']")
	private WebElement chkBox;
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proChkShi;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement payBank;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confOrd;
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logOut;
	@FindBy(xpath="//input[@class='search_query form-control ac_input']")
	private WebElement searchBox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchClick;
	@FindBy(xpath="(//a[@title='Blouse'])[2]")
	private WebElement clickBlouse;
	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement clickPrintDress;
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement contShopp;
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement shortSleev;
	@FindBy(xpath="//select[@class='form-control attribute_select no-print']")
	private WebElement selSize;
	@FindBy(xpath="//select[@class='form-control attribute_select no-print']")
	private WebElement selSizeL;
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement payByCheck;
	@FindBy(xpath="(//a[@class='product-name'])[4]")
	private WebElement printSumDre1;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void clickSignin(){
	signIn.click();

}
public void setUserName(String un){
	emailAddTxtBox.sendKeys(un);
}
public void setPwd(String pwd){
	pwdTxtBox.sendKeys(pwd);
}
public void clickLogin(){
	LoginBtn.click();
}
public void clickWomen(){
	women_Menu.click();
	
}
public void clickfadedShortSleev(){
	fadedShortSleev.click();
}

public void addToCart(){
	addToCart.click();
}
public void proBtn(){
	proBtn.click();
}
public void sriGaj(){
	sriGaj.click();
}
public void signOut(){
	signOut.click();
}
public void dressMenu(){
	dressMenu.click();	
}
public void printDress(){
	printDress.click();
}
public void plusSign(){
	plusSign.click();
	
}
public void addCart(){
	addCart.click();
}
public void proChkOut(){
	proChkOut.click();
}
public void proChkTwo(){
	proChkTwo.click();
}
public void proChkAddr(){
	proChkAddr.click();
}
public void chkBox(){
	chkBox.click();
}
public void proChkShi(){
	proChkShi.click();
}
public void payBank(){
	payBank.click();
}
public void confOrd(){
	confOrd.click();
}
public void logOut(){
	logOut.click();
}
public void setSearchBox(String SB){
	searchBox.sendKeys(SB);
	
}
public void searchClick(){
	searchClick.click();
}
public void clickBlouse(){
	clickBlouse.click();
}
public void clickPrintDress(){
	clickPrintDress.click();
}
public void contShopp(){
	contShopp.click();
}

public void shortSleev(){
	shortSleev.click();
}
public void selSize() throws AWTException{
	selSize.click();
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
}
public void selSizeL() throws AWTException{
	selSizeL.click();
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}
public void payByCheck(){
	payByCheck.click();
}
public void printSumDre1(){
	printSumDre1.click();

}
}


