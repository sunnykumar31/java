import java.util.Scanner;
public class zero {
    void noofzero(int n){
        int fact=1;
        for(int i=1;i<n+1;i++){
            fact*=i;
        }
        int c=0;
        while(fact%10==0){
            c++;
            fact/=10;
        }
        System.out.println("no of zero is "+c);
    }
    public static void main(String args[]){
        zero obj=new zero();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        obj.noofzero(n);
    }
}
