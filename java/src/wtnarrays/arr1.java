package wtnarrays;

public class arr1 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int sum=0;
		for (int i=0 ; i<arr.length;i++) {
			sum+=arr[i];
		}
		
		double avg=0;
		avg=sum/arr.length;
		System.out.println(sum+","+avg);

	}

}
