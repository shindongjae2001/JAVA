/**
 * 2023-04-04
 * 신동재
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 * #문제분석
 * -변수:i,j
 * #알고리즘
 * 1.줄수 입력
 * 2.중첩반복
 * 	while(i<=num) // 줄 반복
 * 		{
 * 			while(j<=i) //별 찍기 반복
 * 			  별 찍기	
 * 		}
 */
package chap05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input number :");
		int num=stdin.nextInt();
		int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println(" "); //줄 바꿈
			i=i+1;
			
		}
		
		
		
	}

}
