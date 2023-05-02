/* 202095050 신동재
 * 04-18
 * null과 NullpointException
 * 참조변수의 ==연산 과 equals()메소드
 */
package chap06;

public class ArrayReference1 {

	public static void main(String[] args) {
		//int[] intArray=null;
		//intArray[0]=10; //참조객체 없으므로 Nullpointexception
		
		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2) {
			System.out.println("strVal1, strVal2 same reference");
		}
		else {
			System.out.println("strVal1, strVal2 different reference");
		}
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1, strVal2 same string.");
		}
		
		String strVal3=new String("Mklee");
		String strVal4=new String("Mklee");
		
		if(strVal3==strVal4) {
			System.out.println("strVal3, strVal4 same diference");
		}
		else {
			System.out.println("strVal3, strVal4 diferent reference");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3,strVal4 same string.");
		}
		
		

	}

}
