import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inum1 = sc.nextInt();
        int inum2 = sc.nextInt();
        
        int icount = 0;
        int iresult = 0;
        
        for(int i=1;i<=inum1;i++) {
        	if(inum1%i==0) {
        		icount++;
        		if(icount == inum2) {
        			iresult = i;
        			break;
        		}
        	}
        }
        System.out.print(iresult);
    }
}
