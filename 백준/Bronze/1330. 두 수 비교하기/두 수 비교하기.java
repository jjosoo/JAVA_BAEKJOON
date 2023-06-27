import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		
		if(inum1>inum2) {
			System.out.println(">");
		}
		else if(inum1<inum2) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
	}
}