import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int icnt = sc.nextInt();
		int[] isum = new int[icnt];
		int[] arry_inum1 = new int[icnt];
		int[] arry_inum2 = new int[icnt];
		
		
		for(int i=0;i<icnt;i++) {
			int inum1 = sc.nextInt();
			int inum2 = sc.nextInt();
			
			arry_inum1[i] = inum1;
			arry_inum2[i] = inum2;
			isum[i] = inum1 + inum2;
		}
		
		for(int i=0;i<icnt;i++) {
			System.out.printf("Case #%d: %d + %d = %d\n",i+1,arry_inum1[i],arry_inum2[i],isum[i]);
		}
	}
}