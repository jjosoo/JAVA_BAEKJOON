import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int icnt = sc.nextInt();
		
		for(int i=0;i<icnt;i++) {
			for(int j=0;j<(i+1);j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}