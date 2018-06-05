/*
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is:
 *                         9009 = 91 × 99;
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
import java.util.*;
public class LargestPalindromeProduct {
	public static void main(String[] args) {
		ArrayList<Integer> nList = new ArrayList<>();
		for(int a = 999; a >= 100; a--) {
			for(int b = a; b >= 100; b--) {
				int prod = a * b;
				if(isPolidom(prod)) {
					nList.add(prod);
				}
			}
		}
		Collections.sort(nList);
		System.out.print(nList.get(nList.size() - 1));
	}

	public static int product(int a, int b) {
		return a * b;
	}
	public static boolean isPolidom(int num) {
		String strNum = String.valueOf(num);
		boolean isPalidom= true;
		for(int i = 0; i < strNum.length()/2; i++) {
			if(!strNum.substring(i, i + 1).equals(
			   strNum.substring(strNum.length() - (i + 1), strNum.length() - i))) {
				isPalidom = false;
				break;
			}
		}
		return isPalidom;
	}

}
