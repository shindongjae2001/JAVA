/**
 * 2023.03.28
 * 202095050 신동재
 * 조건문 연습
 */
package chap4;
import java.util.Scanner;

public class SimpleTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score:");
		int grade=stdin.nextInt();
		
		if (grade>=90)
		{
			System.out.println("pass");
		
			System.out.println("congraturation");
			System.out.print("thankyou");
		}
		else
			System.out.print("non pass");
	}

}
