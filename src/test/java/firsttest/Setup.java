package firsttest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*	
- Launch Browser
- Open URL
- Validate Title 
- Close Browser
*/ 
 
public class Setup {

	public static void main(String[] args) {
		
		//1. Launch Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2. Open Url
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//3. Validate Title (IRCTC Next Generation eTicketing System)
		String act_title=driver.getTitle();
		if(act_title.equals("IRCTC Next Generation eTicketing System")) {
			System.out.println("Correct Page!");
		}
		else {
			System.out.println("Wrong Page!");
		}
		 
		//4. Close
		driver.close();
	}

}
