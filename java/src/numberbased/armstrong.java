package numberbased;

public class armstrong {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int r,sum=0;
		int val=n;
		int fn=n;
		int len=0;
		while(val!=0) {
			len+=1;
			val=val/10;
		}
		
		while(fn!=0) {
			int pro=1;
			r=fn%10;
			for(int i=1;i<=len;i++) {
				pro*=r;
			}
			sum+=pro;
			fn=fn/10;
		}
		
		if(sum==n) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		
	}

}
