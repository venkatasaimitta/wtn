package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ecep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of elements in array");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("enter array elements");
		try {
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("enter the index to find element in array");
		int key = s.nextInt();
		
			
			System.out.println(arr[key]);
			System.out.println("array elements succesfully accessed");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			
		}
		catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		s.close();
		
		
	}

}
