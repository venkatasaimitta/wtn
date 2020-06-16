package wtnarrays;

import java.util.HashSet;

public class duplicate {
	public static void main(String[] args) {
		int arr[]= {12,34,12,45,67,89};
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		
		for(int i:hs) {
		System.out.print(i+" ");
		}
	}

}
