import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum = sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n", inum,i,inum*i);
		}
		
	}
}