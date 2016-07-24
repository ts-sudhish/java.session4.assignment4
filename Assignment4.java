/**
 * 
 */
package sdh.java.session4;

import java.util.Scanner;

/**
 * @author Sudhish
 *
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		System.out.println("Enter a string: ");
		String word = in.next();
		System.out.println("Entered string is = "+word);
		System.out.print("Entered string in reverse order is = ");
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}
