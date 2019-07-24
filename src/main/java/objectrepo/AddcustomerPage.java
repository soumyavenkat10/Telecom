package objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddcustomerPage {
public AddcustomerPage() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(xpath="//label[text()='Done']")
private WebElement done;
@FindBy(id="fname")
private WebElement fname;
@FindBy(id="lname")
private WebElement lname;
@FindBy(id="email")
private WebElement email;
@FindBy(name="addr")
private WebElement addr;
@FindBy(id="telephoneno")
private WebElement phno;
@FindBy(name="submit")
private WebElement btnSubmit;
@FindBy(xpath="//label[text()='Email-ID is not valid']")
private WebElement errmsg;
@FindBy(xpath="//input[@type='reset']")
private WebElement btnReset;

@FindBy(id="message7")
private WebElement PhnErrMsg;



public WebElement getPhnErrMsg() {
	return PhnErrMsg;
}
@FindBy(xpath="//td[@align='center']//h3")
private WebElement customerId;


public WebElement getCustomerId() {
	return customerId;
}
public WebElement getBtnReset() {
	return btnReset;
}
public WebElement getErrmsg() {
	return errmsg;
}
public WebElement getDone() {
	return done;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getAddr() {
	return addr;
}
public WebElement getPhno() {
	return phno;
}
public WebElement getBtnSubmit() {
	return btnSubmit;
}


}



