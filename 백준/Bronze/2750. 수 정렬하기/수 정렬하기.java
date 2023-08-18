
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		int[] iarr = new int[inum];
		for(int i=0;i<iarr.length;i++) {
			iarr[i] = sc.nextInt();
		}
		
		Arrays.sort(iarr);
		
		for(int i=0;i<iarr.length;i++) {
			System.out.println(iarr[i]);
		}
		
	}

}


