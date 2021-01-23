package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NssTodoListvPage;
import util.BroweserFactory;

public class StepsDef {
	WebDriver driver;
	NssTodoListvPage ExamPage ;
	@Before
	public void Befor_run() {
		driver = BroweserFactory.unit();
		 ExamPage = PageFactory.initElements(driver, NssTodoListvPage.class);
		
	}
	@Given("^Sky Blue Backgroun Button Exist$")
	public void sky_Blue_Backgroun_Button_Exist() throws Throwable {

	}

	@When("^I click on the Button$")
	public void i_click_on_the_Button() throws Throwable {
		ExamPage.User_Click_on_Sky_Blue_Background_Button(); 
	}

	@Then("^the backGround change to Blue$")
	public void the_backGround_change_to_Blue() throws Throwable {
		ExamPage.BackGrounPageisSkyBlue(driver);
		BroweserFactory.Teardown();
	}

	@Given("^white BackGround Button Exists$")
	public void swhite_BackGround_Button_Exists() throws Throwable {
		

	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		ExamPage.User_Click_on_White_Background_Button();
	    
	}

	@Then("^The background will change to  white$")
	public void the_background_will_change_to_white() throws Throwable {
		ExamPage.BackGrounPageisWhite(driver);
		BroweserFactory.Teardown();
	    
	}


	
	
}
