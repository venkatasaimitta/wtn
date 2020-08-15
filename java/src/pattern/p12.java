package pattern;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int k=5;
		for (int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(k+++"  ");
			}
			System.out.println();
		}


	}

}
