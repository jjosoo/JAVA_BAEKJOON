import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        
        char[] charArr = Str.toCharArray();
        Arrays.sort(charArr);
        
        StringBuilder sb = new StringBuilder(new String(charArr)).reverse();
        
        System.out.println(sb);
    }
}
