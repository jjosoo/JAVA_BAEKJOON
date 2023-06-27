import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		
		int inum3 = (inum2%10)*inum1;
		int inum4 = ((inum2%100)/10)*inum1;
		int inum5 = (inum2/100)*inum1;
		
		System.out.println(inum3);
		System.out.println(inum4);
		System.out.println(inum5);
		System.out.println(inum3+(inum4*10)+(inum5*100));
		
	}
	
}