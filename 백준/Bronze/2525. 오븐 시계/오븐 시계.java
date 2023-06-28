import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ihour = sc.nextInt();
		int imin = sc.nextInt();
		int itime = sc.nextInt();
		
		int iresult = (ihour*60) + imin + itime;
		ihour = iresult/60;
		imin = iresult%60;
		
		if(ihour>=24) {
			ihour = ihour-24;
			System.out.printf("%d %d",ihour,imin);
		}else {
			System.out.printf("%d %d",ihour,imin);
		}
	}
}