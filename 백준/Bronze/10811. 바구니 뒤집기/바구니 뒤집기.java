import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int icount = sc.nextInt();
        int isort = sc.nextInt();
        
        int ibasket[] = new int[icount+1];
        
        for(int i=1; i<=icount;i++){
            ibasket[i] = i;
        }
        
        for(int k=0; k<isort; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            for(int h=i; h<=j; h++){
                int n = j--;
                
                int itemp = ibasket[h];
                ibasket[h] = ibasket[n];
                ibasket[n] = itemp;
            }
        }
       for(int i=1; i<=icount;i++){
           System.out.print(ibasket[i]+" ");
       }
    }
}