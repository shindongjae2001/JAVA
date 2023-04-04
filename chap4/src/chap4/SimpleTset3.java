/**
 * 2023.03.28
 * 202095050 신동재
 * 조건문 연습
 */
package chap4;
import java.util.Scanner;
public class SimpleTset3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score:");
		int grade=stdin.nextInt();
		
		switch (grade/10)
		{
			case 10:
				System.out.println("A"); //10일 때 9일 떄 같으므로 생략가능 !!(break도 생략가능)
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("C");
				break;
			case 7:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		}
	}

}
