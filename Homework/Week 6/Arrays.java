package helloworld;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array");
		int length = scan.nextInt();
		//int [] arr = new int[size];
		int sum = 0;
		for(int i = 0; i < length;i++) {
			//arr[i] = scan.nextInt();
			sum += scan.nextInt();
		}
		System.out.println("Your sum is "+ sum);
		System.out.println("Enter size and power");
		int size = scan.nextInt();
		int power = scan.nextInt();
		scan.close();
		int[] ans = toPower(size,power);
		for(int i = 0; i < ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] toPower(int size,int power) {
		int[] ans = new int[size];
		for(int i = 0; i < size;i++) {
			ans[i] = (int)Math.pow(i, power);
		}
		return ans;
	}

}
