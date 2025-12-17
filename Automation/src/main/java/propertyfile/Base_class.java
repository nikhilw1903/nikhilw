package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base_class {
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties dataprop;
	public static Properties uatprop;

	public static void intiproperties() throws IOException {
//		data 
		 fis = new FileInputStream(projectpath + "\\src\\test\\resources\\data.properties");
		    dataprop = new Properties();
		    dataprop.load(fis);

//		UAT properties
		    fis = new FileInputStream(projectpath + "\\src\\test\\resources\\UAT.properties");
		    uatprop = new Properties();
		    uatprop.load(fis);
	}
}
