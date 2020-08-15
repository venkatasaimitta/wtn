package pattern;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		for (int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
