/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원,100원,50원,10원짜리 동전으로 교환해주는 프로그램 작성
 * 조건1:동전의 총개수를 최소화
 * 조건2:고액의 동전 우선 교환
 * 
 */
package chap3;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("액수를 입력하시오:");
		int coin=stdin.nextInt();
		
		int num1=coin/500;
		System.out.println("500원"+num1+"개");
		int num2=coin%500/100;
		System.out.println("100원"+num2+"개");
		int num3=coin&500%100/50;
		System.out.println("50원"+num2+"개");
		int num4=coin%500/100&50/10;
		System.out.println("10원"+num4+"개");
		int num5=coin%500/100%50%10;
		System.out.println("남은잔돈"+num5+"원");
		
		
		
	}

}
