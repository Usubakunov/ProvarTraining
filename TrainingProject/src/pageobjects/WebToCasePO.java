package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCasePO"                                
     , summary=""
     , relativeUrl=""
     , connection="WebTesting"
     )             
public class WebToCasePO {

	@TextType()
	@FindBy(xpath = "//input[@id='input_14_1' and @type='text']")
	public WebElement ContactName;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_2' and @type='text']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_3' and @type='text']")
	public WebElement Phone;
}
