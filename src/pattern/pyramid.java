package pattern;
import java.util.*;
class pyramid {
    static void pattern() {
        Scanner input=new Scanner(System.in);
        System.out.print("-----PYRAMID-----\nEnter rows:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}