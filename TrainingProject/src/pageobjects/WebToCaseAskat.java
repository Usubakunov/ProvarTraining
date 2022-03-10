package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCaseAskat"                                
     , summary=""
     , relativeUrl=""
     , connection="WebTesting"
     )             
public class WebToCaseAskat {

	@TextType()
	@FindBy(xpath = "//input[@name='input_1' and @aria-invalid='false' and contains(@class,'medium') and @id='input_14_1' and @type='text' and @value='']")
	public WebElement ContactName;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_2']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_6']")
	public WebElement phone;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='input_14_4']")
	public WebElement priority;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_5']")
	public WebElement subject;
	@ButtonType()
	@FindBy(xpath = "//input[@id='gform_submit_button_14']")
	public WebElement Submitbutton;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='I AGREE']")
	public WebElement iAGREE;
	@TextType()
	@FindBy(xpath = "//input[@id='search']")
	public WebElement search;
	@ButtonType()
	@FindBy(xpath = "//button[@id='search-icon-legacy']")
	public WebElement search1;
			
}
