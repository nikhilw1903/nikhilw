package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class base2property {
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream file;
	public static Properties pro;
	public static Properties uatprop2;

	public static void initiateproperty() throws IOException {

		file = new FileInputStream(projectpath + "\\src\\test\\resources\\data2.properties");

		pro = new Properties();

		pro.load(file);

//		uAT2

		file = new FileInputStream(projectpath + "\\src\\test\\resources\\UAT2.properties");

		uatprop2 = new Properties();
		uatprop2.load(file);

	}

}
