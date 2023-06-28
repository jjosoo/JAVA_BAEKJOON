import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int icnt = sc.nextInt();
		int[] isum = new int[icnt];
		
		for(int i=0;i<icnt;i++) {
			int inum1 = sc.nextInt();
			int inum2 = sc.nextInt();
			
			isum[i] = inum1 + inum2;
		}
		
		for(int i=0;i<icnt;i++) {
			System.out.printf("Case #%d: ",i+1);
			System.out.printf("%d\n", isum[i]);
		}
	}
}