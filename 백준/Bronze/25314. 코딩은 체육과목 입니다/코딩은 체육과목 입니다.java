import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum = sc.nextInt();
		String slong = "long";
		
		for(int i=0;i<(inum/4);i++){
			System.out.printf("%s ",slong);
		}
		
		System.out.println("int");
	}
}