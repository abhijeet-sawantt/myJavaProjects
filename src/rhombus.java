import java.util.*;
class rhombus{
    static void pattern() {
        Scanner input=new Scanner(System.in);
        System.out.print("-----RHOMBUS-----\nEnter rows:");
        int n=input.nextInt();
        int n2=n;
        for(int i=1;i<=n;i++){
            for(int j=n2-1;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            n2--;
            System.out.println();
        }
    }
}