/**
 * 2023.03.28
 * 202095050 신동제
 * 입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램 작성
 */
package chap4;
import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num=stdin.nextInt();
		
		if (num==0)
			System.out.print("숫자는 0");
		else if (num>0)
			System.out.print("숫자는 양수");
		else
			System.out.print("숫자는 음수");
		
	}

}
