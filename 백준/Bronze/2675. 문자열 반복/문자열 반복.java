import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int inum1 = sc.nextInt();
		
		for(int k=0;k<inum1;k++) {
			int inum2 = sc.nextInt();
			String str1 = sc.next();
			
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<inum2;j++) {
					sb = sb.append(str1.charAt(i));
				}
			}
			if(k!=inum1-1) {
				sb.append("\n");
			}
		}System.out.print(sb);
	}
	
}
