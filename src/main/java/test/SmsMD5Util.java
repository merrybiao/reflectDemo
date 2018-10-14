package test;

import java.util.ResourceBundle;

public class SmsMD5Util {
	public static String encoding(String data) {
		try {
			ResourceBundle bundle = ResourceBundle.getBundle("bjsms");
			String key = bundle.getString("key");
			return MD5Util.md5(key + data);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
}
