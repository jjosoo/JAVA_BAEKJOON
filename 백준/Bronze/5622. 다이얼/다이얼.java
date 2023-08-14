import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int icount = 0;
    
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      switch(c){
        case 'A': case 'B': case 'C':
          icount += 3;
          break;
        case 'D': case 'E': case 'F':
          icount += 4;
          break;
        case 'G': case 'H': case 'I':
          icount += 5;
          break;
        case 'J': case 'K': case 'L':
          icount += 6;
          break;
        case 'M': case 'N': case 'O':
          icount += 7;
          break;
        case 'P': case 'Q': case 'R': case 'S':
          icount += 8;
          break;
        case 'T': case 'U': case 'V':
          icount += 9;
          break;
        case 'W': case 'X': case 'Y': case 'Z':
          icount += 10;
          break;                                         
      }
    }
    System.out.println(icount);
  }
}