import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sinput = sc.nextLine();
		int inum = sc.nextInt();
		
		char coutput = sinput.charAt(inum-1);
		System.out.print(coutput);
	}
}
