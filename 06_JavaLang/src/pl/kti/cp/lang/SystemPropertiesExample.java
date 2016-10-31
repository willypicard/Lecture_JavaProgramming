package pl.kti.cp.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;


public class SystemPropertiesExample {

	public static void main(String[] args) {
		printProperty("user.name");
		printProperty("user.home");
		printProperty("user.dir");
		
		System.out.println("==================");
		
		printAllProperties();
	}
	
	public static void printProperty(String propertyName){
		System.out.println(propertyName+" = "+System.getProperty(propertyName));
	}
	
	public static void printAllProperties(){
		Properties properties = System.getProperties();
		Set<String> keys =properties.stringPropertyNames();
		List<String> sortedKeys = new ArrayList<String>(keys);
		Collections.sort(sortedKeys);
		for (Iterator<String> iter = sortedKeys.iterator(); iter.hasNext();){
			String propertyName = iter.next();
			printProperty(propertyName);
		}
	}

}
