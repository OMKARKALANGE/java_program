	//Write a Java program to calculate the average value of array elements.                                                                 public class ArrayAverage {

package javademo;

public class AvgOfArray {
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        int sum = 0;

	        for (int num : array) {
	            sum += num;
	        }

	        double average = (double) sum / array.length;
	        System.out.println("Average of the array elements is: " + average);
	    }
	}


