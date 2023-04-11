/**
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 */
package chap05;
import java.util.Scanner;
public class TextEx3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num=stdin.nextInt();
		int i;
		int sum;
		sum=0;
		for(i=1;i<=1000;i++)
			if (i%num==0)
				sum=sum+i;
		System.out.print(sum);
	}

}
