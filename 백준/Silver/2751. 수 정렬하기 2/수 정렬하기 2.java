
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int inum = sc.nextInt();
    	int[] iarr = new int[inum];
    	
    	for(int i = 0; i < iarr.length; i++) {
    		iarr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(iarr);
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < iarr.length; i++) {
    		sb.append(iarr[i]).append("\n");
    	}
    	
    	System.out.print(sb.toString());
    }
}
