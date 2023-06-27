import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum = sc.nextInt();
		
		if(inum%4==0) {
			if((inum%400 == 0) || (inum%100!=0)) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
	}
}