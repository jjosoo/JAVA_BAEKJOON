import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int[] isum = new int[max];
		
		for(int i=0;i<max;i++) {
			int inum1 = sc.nextInt();
			int inum2 = sc.nextInt();
			
			isum[i] = inum1 + inum2;
		}
		
		for(int i=0;i<max;i++) {
			System.out.printf("%d\n", isum[i]);
		}
	}
}