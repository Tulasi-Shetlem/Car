
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.savaari.com/");
	
	}

}
