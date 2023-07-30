import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';
        String str1 = sc.next();
        
		for(int i=0;i<str1.length();i++){
		    ch = str1.charAt(i);
		    if(65<=ch && ch<=90) {
		        ch+=32;
		        System.out.print(ch);
		    }else{ 
		        ch-=32;
		        System.out.print(ch);
		    }
		}
    }
}