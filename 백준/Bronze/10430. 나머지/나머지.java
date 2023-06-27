import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		int inum3 = sc.nextInt();
		
		System.out.println((inum1+inum2)%inum3);
		System.out.println(((inum1%inum3)+(inum2%inum3))%inum3);
		System.out.println((inum1*inum2)%inum3);
		System.out.println(((inum1%inum3)*(inum2%inum3))%inum3);
	
	}
	
}