import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SavaariLocal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.savaari.com/");
		driver.findElement(By.cssSelector("#approot > mat-sidenav-container > mat-sidenav-content > app-home > div > app-home-container > div.home_tab_outstation_local > div.widget > div.row.ng-star-inserted > div:nth-child(2) > a")).click();
	
		driver.findElement(By.id("fromCityList")).sendKeys("Hydera");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ngb-typeahead-window //button[2]")).click();
		Thread.sleep(4000);
		
	
		driver.findElement(By.cssSelector("button.book-button.btn")).click();
		   

	}

}
