/**
 * 2023-04-04
 * 신동재	
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력 하기
 * #문제분석
 * -변수:first, second, total
 * #알고리즘
 * 1.정수 입력(first,second)
 * 2.선택문(if (first<second)) 
 * 3.반복문(for (first; second; first))
 * 				toral=total+first
 */
 
package chap05;

import java.util.Scanner;

public class TextEx5 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int first=stdin.nextInt();
		int second=stdin.nextInt();
		int temp, total=0;

		if(first>second) 
		{
			temp=first;
			first=second;
			second=temp;
		}	
		//반복(first~second까지의 합계)
		while (first<=second)
		{
			total=total+first;
			first=first+1;
		}
		System.out.print("first~second total : "+total);
	}
}