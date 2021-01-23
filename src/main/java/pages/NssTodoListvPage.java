package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NssTodoListvPage {
	WebDriver driver;

	public NssTodoListvPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")
	WebElement SKY_BLUE_BUTTON_ELEMENT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	WebElement WHITE_BUTTON_ELEMENT_LOCATOR;

	public void User_Click_on_Sky_Blue_Background_Button() {

		SKY_BLUE_BUTTON_ELEMENT_LOCATOR.click();

	}

	public void BackGrounPageisSkyBlue(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	public void User_Click_on_White_Background_Button() {

		WHITE_BUTTON_ELEMENT_LOCATOR.click();

	}

	public void BackGrounPageisWhite(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}