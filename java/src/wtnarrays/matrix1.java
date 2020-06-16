package wtnarrays;

public class matrix1 {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		int n=args.length;
		if (n<4) {
			System.out.println("enter 4 numbers");
		}
		
		//matrix initilization
		int k=0;
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(args[k++]);
				
			}
		}
		
		//matrix printing
		/*for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}*/
		
		//reversing array
		for (int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
			System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
			
		}
		
		

	}

}
