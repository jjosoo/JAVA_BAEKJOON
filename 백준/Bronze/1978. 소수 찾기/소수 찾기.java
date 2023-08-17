import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		int[] iarr = new int[inum];
		int icnt = 0;
		
		for(int i=0;i<iarr.length;i++) {
			iarr[i] = sc.nextInt();
		}
		
		for(int i=0;i<iarr.length;i++) {
			if(iarr[i]!=1) {
				int j;
				for(j=2;j*j<=iarr[i];j++) {
					if(iarr[i]%j==0) {
						break;
					}
				}
				if(j*j>iarr[i]) {
					icnt++;
				}
			}
		}System.out.print(icnt);
	}

}
