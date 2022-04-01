import java.util.Scanner;
class swap
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" -> ");
        }
        System.out.println("");
        int temp;
        if(n%2==0){
            for(int i=0;i<n;i=i+2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        else{
            for(int i=0;i<n-1;i=i+2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" -> ");
        }
    }
    public static void main(String ar[]){
        swap obj=new swap();
        obj.func();
    }
}