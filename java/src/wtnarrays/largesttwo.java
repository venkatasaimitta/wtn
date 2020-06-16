package wtnarrays;

import java.util.Arrays;

public class largesttwo {

	public static void main(String[] args) {
	int arr[] = {10,8,5,6,888,44,66,55};
	/*int temp;
	for (int i=0;i<arr.length;i++) {
		for (int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
	}*/
	
	Arrays.sort(arr);
	System.out.println("Smallest two in the array: " + arr[0] + " and " + arr[1]);
	System.out.println("Largest two in the array: " + arr[arr.length-1] + " and " + arr[arr.length-2]);

}
}
