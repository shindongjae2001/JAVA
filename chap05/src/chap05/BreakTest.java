/**
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 * (while,continue 이용)
 */
package chap05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
	/**	Scanner stdin=new Scanner(System.in);
				
		int num, sum=0;
		int i= 1;
		
		while (true) {
			System.out.print("input number :");
			num=stdin.nextInt();
			sum+=num;
			if (sum>=1000) break;
			i++;
		}
		System.out.print("1000을 넘은 정수의 값:"+num+",입력받은 수의 평균값:"+sum/i);
		
	**/
		
		
		int sum= 0; //합계
		int cnt= 0; //입력 횟수
		
		while (true) 
		{
			Scanner stdin=new Scanner(System.in);
			System.out.print("input number :");
			int num=stdin.nextInt();
			
			cnt++; //입력 횟수 증가
			sum+=num; //입력받은 값의 합계
			
			if (sum>=1000) //합계가 1000이상인지
				break; //반복종료
			
		}
		System.out.println("sum is: "+sum ); //합계 출력
		System.out.print("avg is: "+sum/cnt ); //평균 출력
		
	}

}
