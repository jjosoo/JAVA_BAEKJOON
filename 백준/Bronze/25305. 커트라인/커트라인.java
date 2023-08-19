import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] inum = new int [2];
    	for(int i=0;i<inum.length;i++) {
    		inum[i] = sc.nextInt();
    	}
    	
    	Integer[] iarr = new Integer [inum[0]];
    	for(int i=0;i<iarr.length;i++) {
    		iarr[i] = sc.nextInt();
    	}
    	Arrays.sort(iarr, Collections.reverseOrder());
    	System.out.print(iarr[inum[1]-1]);
    }
}
