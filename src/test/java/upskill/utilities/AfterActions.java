package upskill.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	TakeScreenShot TakeScreenShotObj = new TakeScreenShot();

	@After
	public void afterActions(Scenario Scenario) throws Exception{
		
		if(Scenario.isFailed()){
			TakeScreenShotObj.screenshots();
		}
		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}