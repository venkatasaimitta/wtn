package duplicate;
//sorted array method 1
//Time Complexity : O(n)
//Auxiliary Space : O(n)

public class removrduplicate {
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,5,5,8};
		int n=arr.length;
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if (arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		
		temp[j]=arr[n-1];
		
		
		for (int i=0;i<=j;i++) {
			System.out.print(temp[i]+" ");
		}
			

	}

}
