package helloworld;
import java.util.Scanner;
import java.util.ArrayList;



public class testClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 5 numbers");
		ArrayList<Integer> five = new ArrayList<Integer>();
		for(int i=0;i < 5; i++) {
			five.add(scan.nextInt());
		}
		scan.close();
		int sum = sum(five);
		int mult = multiplication(five);
		int smallest = smallest(five);
		int largest = largest(five);
		System.out.println("Sum is " + sum);
		System.out.println("Multiplication is " + mult);
		System.out.println("Smallest is " + smallest);
		System.out.println("Largest is " + largest);
	}
	public static int sum(ArrayList<Integer> arr){
		int sum = 0;
		for(int i=0;i < arr.size(); i++) {
			sum += arr.get(i);
		}
		return sum;
	}
	public static int multiplication(ArrayList<Integer> arr){
		int mult = 1;
		for(int i=0;i < arr.size(); i++) {
			mult *= arr.get(i);
		}
		return mult;
	}
	public static int smallest(ArrayList<Integer> arr){
		int smallest = arr.get(0);
		for(int i=1;i < arr.size(); i++) {
			if(smallest > arr.get(i)) {
				smallest = arr.get(i);
			}
		}
		return smallest;
	}
	public static int largest(ArrayList<Integer> arr){
		int largest = arr.get(0);
		for(int i=1;i < arr.size(); i++) {
			if(largest < arr.get(i)) {
				largest = arr.get(i);
			}
		}
		return largest;
	}
}
