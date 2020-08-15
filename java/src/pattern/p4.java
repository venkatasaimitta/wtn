package pattern;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}


	}

}
