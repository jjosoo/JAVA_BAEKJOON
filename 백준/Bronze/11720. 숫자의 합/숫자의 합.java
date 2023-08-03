import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int icount = sc.nextInt();
		int isum = 0;
		String str = sc.next();
		int[] arr = new int[icount];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.valueOf(str.charAt(i)-48);
			isum += arr[i];
		}
		System.out.print(isum);
		
	}
}
