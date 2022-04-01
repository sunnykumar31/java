import java.util.Scanner;
public class sale1 {
    void func(){
        try{
            Scanner sc=new Scanner(System.in);
            int em[]=new int[5];
            int sm[]=new int[3];
            int s1=0;
            int item1=0,item2=0,item3=0;
            for(int i=0;i<5;i++){
                System.out.println("Enter the sales of 3 items sold by salesman"+1);
                for(int j=0;j<3;j++){
                    sm[i]=sc.nextInt();
                    s1=s1+sm[i];
                    item1=item1+sm[0];
                    item2=item2+sm[1];
                    item3=item3+sm[2];
                }
                System.out.print("Total sales of item"+i);
                System.out.println("="+s1);
                
            }
            System.out.println("Total sales of item1="+item1);
            System.out.println("Total sales of item1="+item2);
            System.out.println("Total sales of item1="+item3);
        }
        catch(Exception e){
            System.out.println("Problem occured"+e);
        }
    }
    public static void main(String args[]){
        sale obj =new sale();
        obj.func();
    
    }
}
