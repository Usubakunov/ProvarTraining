package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Provarqs__ Product Selector 2 VF"                                
               , summary=""
               , page="ProductSelector2"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="Admin"
     )             
public class provarqs__ProductSelector2VF {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement StageField;
	@PageTable(row = VFTABLE.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<VFTABLE> vFTABLE;
	@PageRow(byColumn = true)
	public static class VFTABLE {

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
	@TextType()
	@FindBy(xpath = "//tr[@id='calRow1']/td[normalize-space(.)='29']")
	public WebElement ClosingDateTest;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDateTest2;
	
}
