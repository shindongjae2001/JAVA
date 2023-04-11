/**
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는 프로그램 작성
 * #문제분석
 * 변수-num1,num2,sum
 * #알고리즘
 * 1.두 정수 입력(num1,num2)
 * 2.선택문(if (num1<=num2))
 * 3.복합논리 (반복문 안에 선택문 포함)
 * 		while(num1<=num2){
 * 		if(num1%2==1){
 * 			sum=sum+num1
 * 			}
 * 					
 * }
 * 
 */
package chap05;
import java.util.Scanner;
public class TextEx4 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("첫번째숫자 입력:");
		int num1=stdin.nextInt();
		System.out.print("두번째숫자 입력:");
		int num2=stdin.nextInt();
		int i;
		int sum;
		sum=0;
		int temp=0;
		if(num1>num2) 
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		while (num1<=num2) 
		{
			if (num1%2==1)
			{
				sum=sum+num1;
			}
				num1=num1+1;
		
	}
		System.out.print(sum);
		
	}
}
