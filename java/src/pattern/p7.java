package pattern;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int k=1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}


	}

}
