import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum = sc.nextInt();
		
		for(int i=0;i<inum;i++) {
			for(int j=0;j<inum-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i+1);j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}