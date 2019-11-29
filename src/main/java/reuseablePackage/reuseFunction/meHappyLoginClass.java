
package reuseablePackage.reuseFunction;
import pom.exportChanges;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class meHappyLoginClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public meHappyLoginClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
String user;
String password;
public void meHappyLogin(String user,String password) throws Exception
{
actions.EnterApplicationURL("http://web.meehappy.com:9090/login");
actions.EnterData(new exportChanges(driver).userName,user);
actions.EnterData(new exportChanges(driver).userPassword,password);
actions.Click(new exportChanges(driver).userLogin);
actions.Click(new exportChanges(driver).userLogout);







}
}



































// package reuseablePackage.feature;

// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import java.net.MalformedURLException;

// public class meHappyLoginClass extends  AllActions {
// 	public static WebDriver driver;
	
// 	AllActions actionObject = new AllActions();
	
// 	}  
// }