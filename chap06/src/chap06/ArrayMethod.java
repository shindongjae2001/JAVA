/*
 * 20209505 신동재
 * 04-18
 * Arrays 클래스의 주요 메소드
 * 클래스는 속성과 기능으로 구성
 * 
 */
package chap06;
import java.util.Arrays;
public class ArrayMethod {

	public static void main(String[] args) {
		int[] int1= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("array:"+Arrays.toString(int1));
		
		Arrays.fill(int1,3,5,33); //int1[3],[4]33으로 변경
		System.out.println("after fill():"+Arrays.toString(int1));
		
		Arrays.sort(int1);
		System.out.println("agter sort():"+Arrays.toString(int1));
		
		System.out.println("33s location is "+Arrays.binarySearch(int1, 33));
		
		

	}

}
