import java.util.Scanner;

public class ZPattern {
    public static void main(String[] args) {
        int n;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = 1;
        int i = 1;
        int s ;
        int co = 0;
        for (int idx = 1; idx <= n; idx++) {
            c = co+idx;
            for(s=i;s<n;s++){
                System.out.print(" ");
            }
            i++;
            for(int j=c;j>co;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            co = c;
        }
        i=i-1;
        int temp = n;
        for (int idx = 1; idx <= n; idx++) {
           for(s=i;s<n;s++){
                System.out.print(" ");
           }
           i--;
           int t = temp-1;
           while(temp-->0){
             System.out.print(co--+" ");
           }
           System.out.println();
           temp = t;
        }
    }
}
