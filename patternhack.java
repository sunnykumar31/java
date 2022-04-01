import java.io.*;
import java.util.*;

public class patternhack {
    void func(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[][]=new int[n][1000];
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            for(int j=0;j<k;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        int d=sc.nextInt();
        for(int i=0;i<d;i++){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(ar[p-1][q-1]!=0){
                System.out.println(ar[p-1][q-1]);
            }
            else{
                System.out.println("ERROR!");
            }
        }
        
        
        
    
    }

    public static void main(String[] args) {
        patternhack obj=new patternhack();
        obj.func();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}