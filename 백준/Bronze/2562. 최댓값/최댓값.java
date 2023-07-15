import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int[] iarray = new int[9];
		
		for(int i=0;i<iarray.length;i++) {
			iarray[i] = sc.nextInt();
		}
		
		int imax = 0;
		int icount = 0;
		
		for(int i=0;i<iarray.length;i++) {
			if(imax<iarray[i]) {
				imax = iarray[i];
				icount = i+1;
			}
		}
		System.out.println(imax);
		System.out.println(icount);
	}
}
