/*
 *If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 *The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000. 
 *
 *Solved on Dec 24, 2017 by Chao Jiang
 */
import java.util.*;
public class ThreeAndFive {
	public static void main(String[] args) {
		Set<Integer> muls = new HashSet<>();
		for(int i = 0; i < 1000; i++) {
			if(i%3 == 0)
				muls.add(i);
			if(i%5 == 0)
				muls.add(i);
		}
		System.out.println(plus(muls));
	}
	public static int plus(Set<Integer> set) {
		int sum = 0;
		for(int n: set) {
			sum += n;
		}
		return sum;
	}

}
