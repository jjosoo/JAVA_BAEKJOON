import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		
		if(inum1>=0 && inum2>=0) {
			System.out.println("1");
		}
		if(inum1<0 && inum2>=0) {
			System.out.println("2");
		}
		if(inum1<0 && inum2<0) {
			System.out.println("3");
		}
		if(inum1>=0 && inum2<0) {
			System.out.println("4");
		}
		
	}
}