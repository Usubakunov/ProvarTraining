package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Provarqs__ Product Selector 2 V Fwwwww"                                
               , summary=""
               , page="ProductSelector2"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="Admin"
     )             
public class provarqs__ProductSelector2VFwwwww {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName22;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
	}
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	
}
