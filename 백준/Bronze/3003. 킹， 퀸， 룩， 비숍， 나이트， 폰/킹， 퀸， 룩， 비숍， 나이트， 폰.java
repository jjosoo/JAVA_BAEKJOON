import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] inum = new int[6];
		
		for(int i=0;i<inum.length;i++) {
			inum[i] = sc.nextInt();
		}
		
		int[] ichess = {1,1,2,2,2,8};
		int[] iresult = new int[6];
		
		for(int i=0;i<inum.length;i++){
			iresult[i] = ichess[i] - inum[i];
		}
		for(int i=0;i<inum.length;i++){
			System.out.print(iresult[i]+ " ");
		}
		
		
	}
	
}

