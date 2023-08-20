import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] iarr = new int[5];
    	int isum = 0;
    	
    	for(int i=0;i<iarr.length;i++) {
    		iarr[i] = sc.nextInt();
    		isum+=iarr[i];
    	}
    	
    	Arrays.sort(iarr);
    	
    	System.out.println(isum/5);
    	System.out.println(iarr[2]);
    	
    }
}
