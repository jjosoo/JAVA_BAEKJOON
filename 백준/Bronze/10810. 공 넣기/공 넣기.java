import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		int[] ibasket = new int[inum];
		int icount = sc.nextInt();
		
		for(int fi=0;fi<icount;fi++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(int fi2=i-1;fi2<j;fi2++) {
				ibasket[fi2]=k;
			}
		}
		for(int i=0;i<inum;i++) {
			System.out.println(ibasket[i]);
		}
	}
}
