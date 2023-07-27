import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] inum = new int[10];
        int icount = 0;
        for(int i=0;i<10;i++){
            inum[i] = sc.nextInt()%42;
        }
        for(int i=0;i<10;i++){
            int itemp = 0;
            for(int j=i+1;j<10;j++){
                if(inum[i]==inum[j]){
                    itemp++;
                }
            }
            if(itemp==0){
                icount++;
            }
        }
        System.out.println(icount);
	}

}
