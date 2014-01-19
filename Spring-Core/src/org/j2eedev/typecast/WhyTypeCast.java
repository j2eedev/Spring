package org.j2eedev.typecast;
/*
* Source code examples @Geek ON Java
* http://j2eedev.org
*/
/**
 * @author Umashankar
 * http://j2eedev.org
 * 
 */
public class WhyTypeCast {
	public static void main(String[] args) {
		// Normal way of declaration
		Object object = new Object();
		Long studentNo = new Long(1);
		String studentName = new String("J2eeDev");
		/*
		 * Super class reference can refer to sub class object. Here Super
		 * class-->Object Sub class--> String/Long
		 */
		Object studentNoObj = new Long(1);
		Object studentNameObj = new String("J2eeDev");
		// System.out.println(".Student Name length()." +
		// studentNameObj.length());
		String studentNameRef = (String) studentNameObj;
		System.out.println(".Student Name length()." + studentNameRef.length());
		// studentNameRef = (String) object;
	}
}
