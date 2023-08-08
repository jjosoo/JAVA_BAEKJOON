import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		StringTokenizer str2 = new StringTokenizer(str1," ");
		System.out.print(str2.countTokens());
	}
	
}
