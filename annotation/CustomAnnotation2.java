package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// marker annotation no any value 
// single annotation only one value 
// multiple annotation multiple value

@Target(ElementType.TYPE) // work with class level annotation
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String moName();

	int version();
}

@SmartPhone(moName = "Realme", version = 9)
class MobielPhone {

	public MobielPhone() {

	}
}

public class CustomAnnotation2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		
//		MobielPhone mp=new MobielPhone();
//		
//		Class<?> c= mp.getClass();
//		Annotation an=c.getAnnotation(SmartPhone.class);
//		
//		SmartPhone s= (SmartPhone) an;
//		System.out.println(s.moName());
//		System.out.println(s.version());

		SmartPhone s = MobielPhone.class.getAnnotation(SmartPhone.class);
		System.out.println(s.moName() + "," + s.version());

	}

}
