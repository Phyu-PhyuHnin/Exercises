package Exercise6;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		
		hashMap.put("Coffee","180");
		hashMap.put("Tea","160");
		hashMap.put("Juice","200");
		hashMap.put("Ice cream","220");
//Output value by Key_name		
		String str = (String) hashMap.get("Coffee");
		System.out.println("Get HashMap by key_name :Coffee/ "+ str);
		
		String str1 = (String) hashMap.get("Tea");
		System.out.println("Get HashMap by key_name :Tea/ "+ str1);
		
		String str2 = (String) hashMap.get("Juice");
		System.out.println("Get HashMap by key_name :Juice/ "+ str2);
		
		String str3 = (String) hashMap.get("Ice cream");
		System.out.println("Get HashMap by key_name :Ice cream / "+ str3);
		
//Output by keySet()		
		System.out.println("Get HashMap by KeySet : "+ hashMap.keySet());
		
	}

} 
