import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int inum = sc.nextInt();
            if (inum == -1){
                break;
            }
            
            StringBuilder sb = new StringBuilder();
            int isum = 0;

            for (int i = 1; i < inum; i++) {
                if (inum % i == 0) {
                    isum += i;
                    sb.append(i).append(" + ");
                }
            }

            if (inum == isum) {
                sb.setLength(sb.length() - 3);
                System.out.printf("%d = %s\n", inum, sb);
            } else {
                System.out.printf("%d is NOT perfect.\n", inum);
            }
        }
    }
}
