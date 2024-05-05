//Write a Java program to sum values of an array.                                      public class ArraySum {

package javademo;

public class SumOFArray {

	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        int sum = 0;

	        for (int num : array) {
	            sum += num;
	        }

	        System.out.println("Sum of the array elements is: " + sum);
	    }
	}

