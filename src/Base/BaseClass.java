package Base;

import java.io.FileInputStream;
import java.rmi.AccessException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		FileInputStream fis;
		try {
			fis =new FileInputStream("E:\\Java_Development\\jobitoFRm\\src-main\\Config\\proper.properties");
			prop=new Properties();
			prop.load(fis);
		}
		catch(AccessException e) {}
	}
}
