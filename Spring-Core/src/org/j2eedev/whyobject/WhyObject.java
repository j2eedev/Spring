package org.j2eedev.whyobject;
/**
* Free source code examples @j2eedev.org
* http://j2eedev.org
*/
/**
 * @author Umashankar 
 * http://j2eedev.org
 */
public class WhyObject {

	public static Long whyObjectMethod1(Long studentNo) {
		return studentNo;
	}
	public static String whyObjectMethod2(String studentName) {
		return studentName;
	}

	/**
	 * ArrayList add/get methods..
	 * @param object
	 * @return Object
	 */
	/* Object Ref - points to -> Long/String Objects*/
	public static Object whyObjectMethod(Object object) {
		return object;
	}

	public static void main(String[] args) {
		Long studentNo = whyObjectMethod1(new Long(1));
		String studentName = whyObjectMethod2("j2eedev.org");
		studentNo = (Long) whyObjectMethod(new Long(1));
		Object object = whyObjectMethod("j2eedev.org");
		// object - points to -> String object
		System.out.println(".Class Name." + object.getClass().getName());
		// System.out.println(".Student Name length()." + object.length()); this
		// would result in compilation error.
		studentName = (String) object;
		System.out.println(".Student Name length()." + studentName.length());
		System.out.println(studentNo + "::.studentNo.");
	}
}
