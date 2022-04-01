import java.util.Scanner;
public class dublicate {
    void func()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("input the no. of element");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of array");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Entered  elements of array");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.println("\n\n");
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        for(int k=j;k<n-1;k++){
                          arr[k]=arr[k+1];  
                        }
                        j--;
                        n--;
                    }
                   
                }
                
            }
            System.out.println("After deleted the dublicates elements of array");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        dublicate obj=new dublicate();
        obj.func();
    }
            
}
