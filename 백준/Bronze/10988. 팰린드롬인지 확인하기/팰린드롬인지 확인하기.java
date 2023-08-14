import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		String sResult = sb.toString();
		
		if(str.equals(sResult)) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}
}
