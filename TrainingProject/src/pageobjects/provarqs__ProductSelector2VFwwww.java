package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Provarqs__ Product Selector 2 V Fwwww"                                
               , summary=""
               , page="ProductSelector2"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="Admin"
     )             
public class provarqs__ProductSelector2VFwwww {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDateTest222222;
	
}
