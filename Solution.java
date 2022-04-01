import java.io.*;
import java.util.*;

public class Solution {
    void func(){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int ar[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
                sum+=ar[i];
            }
//            System.out.println(sum);
            int c=0;
            if(sum>=0){
                for(int i=0;i<n;i++){
                    for(int j=0;j<n-i;j++){
                        int s=0;
                        for(int k=0;k<i+1;k++){
                            s=s+ar[j+k];
                            if(s>=0){
                                c++;
                            }
                        }
                    }
                }
            }
            else{
                for(int i=0;i<n;i++){
                    for(int j=0;j<n-i;j++){
                        int s=0;
                        for(int k=0;k<i+1;k++){
                            s=s+ar[j+k];
                            
                            
                        }
                        System.out.println(s);
                        if(s<0){
                                //System.out.println(s);
                                c++;
                            }
                    }
                }
            }
            System.out.println("c="+c);
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Solution obj=new Solution();
        obj.func();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}