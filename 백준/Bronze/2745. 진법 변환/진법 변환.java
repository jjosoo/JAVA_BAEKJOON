import java.util.*;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		int inum1 = sc.nextInt();
		int itemp = 1;
		int iresult = 0;
		
		for (int i = str1.length()-1; i >= 0; i--) {
			char c = str1.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				iresult += (c-'A'+10)*itemp;
			}else {
				iresult += (c-'0')*itemp;
			}
			itemp *= inum1;
		}
		
		System.out.println(iresult);
		
	}
}