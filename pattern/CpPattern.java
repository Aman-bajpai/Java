package pattern;
import java.util.*;

public class CpPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,i,j;
        r = sc.nextInt();
        c = sc.nextInt();
        for(i = 1; i<=r;i++){
            for(j=1;j<=c;j++){
                if((i%4==0 && j==1) || (i%2!=0) || (i%4!=0 && j==c)){
                    System.out.println("#");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
