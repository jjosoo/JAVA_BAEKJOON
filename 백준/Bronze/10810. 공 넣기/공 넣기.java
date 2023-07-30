import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		int[] ibasket = new int[inum];
		int icount = sc.nextInt();
		
		for(int fi=0;fi<icount;fi++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(int fi2=i-1;fi2<j;fi2++) {
				if(fi2 >= 0 && fi2 < inum) { // validation check
					ibasket[fi2]=k;
				} else {
					System.out.println("Index out of range");
				}
			}
		}
		for(int i=0;i<inum;i++) { // Changed from icount to inum
			System.out.println(ibasket[i]);
		}

		sc.close(); // Scanner object closed
	}
}
