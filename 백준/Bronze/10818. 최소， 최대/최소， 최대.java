import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int inum = sc.nextInt();
		int[] iarray = new int[inum];
		
		for(int i=0;i<iarray.length;i++) {
			iarray[i] = sc.nextInt();
		}
		
		int imin = iarray[0];
		int imax = iarray[0];
		
		for(int i=0;i<iarray.length;i++) {
			if(imin>iarray[i]) {
				imin = iarray[i];
			}
			if(imax<iarray[i]) {
				imax = iarray[i];
			}
		}
		System.out.print(imin+" "+imax);
	}
}
