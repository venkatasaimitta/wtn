package pattern;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		for (int i=n;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}


	}

}
