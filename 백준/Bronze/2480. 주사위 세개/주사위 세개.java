import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		int inum3 = sc.nextInt();
		
		//3자리 같음
		if(inum1==inum2 && inum2==inum3 && inum3==inum1) {
			System.out.println(10000+(inum1*1000));
		}
		
		//3자리 다름
		if(inum1!=inum2 && inum2!=inum3 && inum3!=inum1) {
			if(inum1>inum2 && inum1>inum3) {
				System.out.println(inum1*100);
			}
			if(inum2>inum1 && inum2>inum3) {
				System.out.println(inum2*100);
			}
			if(inum3>inum1 && inum3>inum2) {
				System.out.println(inum3*100);
			}
		}
		
		if(inum1==inum2 && inum1!=inum3) {
			System.out.println(1000+(inum1*100));
		}
		if(inum1==inum3 && inum1!=inum2) {
			System.out.println(1000+(inum1*100));
		}
		if(inum2==inum3 && inum2!=inum1) {
			System.out.println(1000+(inum2*100));
		}
		
	}
}