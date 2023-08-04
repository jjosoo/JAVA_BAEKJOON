import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		
		int[][] iarr1 = new int[inum1][inum2];
		int[][] iarr2 = new int[inum1][inum2];
		
		for(int i=0; i<inum1;i++) {
			for(int j=0;j<inum2;j++) {
				iarr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<inum1;i++) {
			for(int j=0;j<inum2;j++) {
				iarr2[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0; i<inum1;i++) {
			for(int j=0;j<inum2;j++) {
				System.out.print(iarr1[i][j]+iarr2[i][j]+" ");
				if(j == inum2-1) {
					System.out.println();
				}
			}
		}
		
	}
	
}

