import java.util.Scanner;
public class SumSquaredifference {

	public static void main(String[] args) {
		System.out.println("please type how many natural numbers you want to use?");
		Scanner input = new Scanner(System.in);
		int numOfNaturlNums = input.nextInt();
		
		System.out.println("diff = " + (squareOfSum(numOfNaturlNums) - sumOfSquare(numOfNaturlNums)));
	}
	
	public static double sumOfSquare(int numOfNaturlNums) {
		double sum = 0;
		for(int i = 1; i <= numOfNaturlNums; i++) {
			sum += Math.pow((double) i, 2);
		}
		return sum;
	}
	
	public static double squareOfSum(int numOfNaturlNums) {
		double sum = 0;
		for(int i = 1; i <= numOfNaturlNums; i++) {
			sum += i;
		}
		return sum * sum;
	}

}
