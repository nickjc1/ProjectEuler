/*
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * */
public class SmallestMultiple {

	public static void main(String[] args) {
		int product = 1;
		for(int num = 1; num <= 20; num++) {
			if(isPrime(num))
				product *= num;
			else {
				if(product % num != 0) {
					if(num % 2 == 0)
						product *= 2;
					else if(num % 3 == 0)
						product *= 3;
					else if(num % 5 == 0)
						product *= 5;
				}
			}
		}
		System.out.println(product);

	}
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int m = 1; m <= n; m++) {
			if(m != 1 && m != n) {
				if(n % m == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}
