import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String restr1 = "";
		String restr2 = "";
		
		for(int i=str1.length()-1;i>=0;i--) {
			restr1 += str1.charAt(i);
			restr2 += str2.charAt(i);
		}
		
		int inum1 = Integer.parseInt(restr1);
		int inum2 = Integer.parseInt(restr2);
		
		if(inum1>inum2) {
			System.out.print(inum1);
		}else {
			System.out.print(inum2);
		}
		
		
	}
	
}
