import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int inum1 = sc.nextInt();
			int inum2 = sc.nextInt();

			if(inum1==0 && inum2==0) {
				break;
			}
			
			if(inum2 != 0 && inum1 % inum2 == 0) {
				System.out.println("multiple");
			}
			else if(inum1 != 0 && inum2 % inum1 == 0) {
				System.out.println("factor");
			}
			else {
				System.out.println("neither");
			}
		}
	
	}
	
}
