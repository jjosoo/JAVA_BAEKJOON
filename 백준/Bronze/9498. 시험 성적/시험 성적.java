import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum = sc.nextInt();
		
		if(inum>=90) {
			System.out.println("A");
		} else if (inum>=80) {
			System.out.println("B");
		} else if (inum>=70) {
			System.out.println("C");
		} else if (inum>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}