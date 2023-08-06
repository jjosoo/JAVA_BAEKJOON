import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		String[] result = new String[inum];
		
		for(int i=0;i<inum;i++) {
			String str1 = sc.next();
			String[] arr = str1.split("",str1.length());
			result[i] = (arr[0]+arr[str1.length()-1]);
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
	}
	
}

