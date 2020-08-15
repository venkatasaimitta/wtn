package numberbased;
import java.util.Scanner;

public class gcdof2numbers {
	public static void main() {
		//Scanner sc=new Scanner(System.in);
		//int n1=sc.nextInt();
		//int n2=sc.nextInt();
		int n1=10;
		int n2=15;
		System.out.println("gcd of 2 numbers is :"+gcd(n1,n2));
		
	}
	static int gcd(int n1,int n2) {
		if(n1==0 || n2==0) {
			return 0;
		}
		if(n1==n2) {
			return n1;
		}
		if(n1>n2) {
			return gcd(n1-n2,n2);
		}
		else {
			return gcd(n1,n2-n1);
		}
	}

}
