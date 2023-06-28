import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum = sc.nextInt();
		int isum = 0;
		
		for(int i=0;i<=inum;i++) {
			isum = isum+i;
		}
		
		System.out.println(isum);
	}
}