package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*reflection allows you to access and modify private fields and methods of a class, 
 * even though they are normally restricted. This can be useful when you need to work 
 * with fields or methods that aren’t accessible in normal code due to access modifiers.
 */

class Secret{
	
	private String msg="This is a private Msg.";
	
	@SuppressWarnings("unused")
	private void showSecret() {
		System.out.println("Show Secret Msg: "+msg);
	}

}
public class PrivateFieldAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	          Secret secret = new Secret();
	          
	          // access private field
	          
	          Field msgField = Secret.class.getDeclaredField("msg");
	          msgField.setAccessible(true);
	          System.out.println("Orignal Msg: "+msgField.get(secret));
	          
	            // Change the value of the private field
	          msgField.set(secret, "This is Modified Field: ");
	          System.out.println("Modified Msg: "+msgField.get(secret));
	          
	            // Access private method "revealSecret" and call it
	          Method showmethod= Secret.class.getDeclaredMethod("showSecret");	
	          showmethod.setAccessible(true);
	          showmethod.invoke(secret);
	          
	          
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
