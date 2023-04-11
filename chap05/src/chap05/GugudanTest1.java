/**
 * 2023.03.28
 * 202095050
 * 입력받은 단의 구구단 출력하기
 */
package chap05;
import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("단 입력:");
		int num=stdin.nextInt();
		int i;
		
		for(i=1;i<10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
