import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		
		int iresult = 0;
		
		if(inum1==0) {
			if(inum2>=45) {
				iresult = (((inum1*60)+inum2)-45);
				inum1 = iresult/60;
				inum2 = iresult%60;
				System.out.printf("%d %d",inum1,inum2);
			}
			else {
				iresult = ((((inum1+24)*60)+inum2)-45);
				inum1 = iresult/60;
				inum2 = iresult%60;
				System.out.printf("%d %d",inum1,inum2);
			}
			
		}
		else{
			iresult = ((inum1*60)+inum2-45);
			inum1 = iresult/60;
			inum2 = iresult%60;
			System.out.printf("%d %d",inum1,inum2);
		}	
	}
}