
public class sumofnumbes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);

	}

}
