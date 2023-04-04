/**
 * 확대 형 변환
 * 날짜
 * 신동재
 */
package chap3;

import java.util.Scanner;
public class Casting_widening {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("first intefer:");
		int first=stdin.nextInt(); // 첫 번째 정수 저장
		
		System.out.print("second integer:");
		int second=stdin.nextInt();
		
		double avg1=(first+second)/2; //정수 정수 연산
		double avg2=(first+second)/2.0; //정수 실수(형변환)연산
		double avg3=(first+second)/(float)2; //정수 실수(형변환)연산
		
		System.out.println("정수연산:"+avg1);
		System.out.println("실수연산:"+avg2);		
		System.out.println("실수연산:"+avg3);
	}

}
