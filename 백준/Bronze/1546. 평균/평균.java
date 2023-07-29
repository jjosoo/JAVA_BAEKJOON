import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int icount = sc.nextInt();
		long [] iscore = new long[icount];
		
		for(int i=0;i<iscore.length;i++) {
			iscore[i] = sc.nextInt();
		}
		
		long lsum = 0;
		long lmax = 0;
		
		for(int i=0;i<iscore.length;i++) {
			if(iscore[i]>lmax) {
				lmax = iscore[i];
			}
			lsum += iscore[i];
		}
		
		System.out.print(lsum*100.0/lmax/icount);
	}
}
