import java.util.Scanner;

public class exarray
{
    void func()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of value you are going to input");
            int n=sc.nextInt();
 
            int arr[]=new int[n];
            System.out.println("enter the elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("output is:");
            for(int j=0;j<n;j++){
                
                if((arr[j]%3==0) || (arr[j]%5==0)){
                    if((arr[j]%3==0) && (arr[j]%5==0)){
                    }
                    else{
                        System.out.println(arr[j]);
                    }
                }
                else{}
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String ar[]){
        exarray obj=new exarray();
        obj.func();
    }
    
}
