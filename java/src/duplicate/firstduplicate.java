package duplicate;

import java.util.HashSet;

public class firstduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,8,5,2,4,96,5,2,1,5,3,0,7,8,2,0,1,5,3,2,1};
		int c=0,min=arr[0];
		if(arr.length==0) {
			System.out.println("0");
		}
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(hs.contains(arr[i])) {
				if(min>=arr[i]) {
					min=arr[i];
				}
				//System.out.println(arr[i]);
				//c+=1;
				//break;
			}
			hs.add(arr[i]);	
		}
		System.out.println(min);
		/*if(c==0) {
			System.out.println(arr[0]);
		}*/

	}

}
