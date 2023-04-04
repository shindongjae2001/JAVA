/**
 * 2023.03.28
 * 202095050 신동재
 * 직급과 나이를 입력 받아서 직급이 7 또는 8이고 나이가 40대이면 "연금80%"
 * 직급이 5 또는 6이고 나이가 50대이면 "연금 100%"
 * 그 외의 경우는 "연금 대상자 아님"
 * 을 출력하는 프로그램
 */
package chap4;
import java.util.Scanner;
public class TsetEx1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("age input:");
		int age=stdin.nextInt();
		System.out.print("rank input:");
		int rank=stdin.nextInt();
		
		if ((rank==7 || rank==8) && (age>=40 && age<=49))
			System.out.print("연금 80%");
		else if ((rank==5 || rank==6 ) && (age>=50 && age<=59))
			System.out.print("연금 100%");
		else 	
			System.out.print("연금 대상자 아님");
	}

}
