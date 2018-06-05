import java.util.Scanner;
public class FindingPrime {
    public static void main(String[] argc) {
    	    int count = 1;  // 1st: 2
    	    int prime = 2;
    	    int integer = 3;
    	    System.out.println("Please type the index of the prime number you want to find:");
    	    Scanner input = new Scanner(System.in);
    	    int index = input.nextInt();
    	    
    	    while(count < index) {
    	    	    if(isEven(integer))
    	    	    	    integer++;
    	    	    int dividend;
    	    	    for(dividend = 1; dividend <= integer/2; dividend++) {
    	    	    	    if(integer % dividend == 0 && dividend != 1) {
    	    	    	    	    integer++;
    	    	    	    	    break;
    	    	    	    }
    	    	    	    if(dividend == integer / 2) {
    	    	    	    	    count++;
    	    	    	    	    prime = integer;
    	    	    	    }
    	    	    }
    	    	    integer++;
    	    }
    	    
    	    System.out.println("the " + index + "st prime integer is " + prime);
    }
    
    public static boolean isEven(int num) {
    	    return num % 2 == 0;  //return true if num is even
    }
}
