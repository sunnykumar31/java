import java.util.Scanner;
public class sale {
    void func(){
        try{
            Scanner sc=new Scanner(System.in);
            int sm1[]=new int[3];
            int sm2[]=new int[3];
            int sm3[]=new int[3];
            int sm4[]=new int[3];
            int sm5[]=new int[3];
            int s1=0,s2=0,s3=0,s4=0,s5=0;
           
            System.out.println("Enter the sales of 3 items sold by salesman 1");
            for(int j=0;j<3;j++){
                sm1[j]=sc.nextInt();
                s1=s1+sm1[j];
            }
            System.out.println("Enter the sales of 3 items sold by salesman 2");
            for(int j=0;j<3;j++){
                sm2[j]=sc.nextInt();
                s2=s2+sm2[j];
            }
            System.out.println("Enter the sales of 3 items sold by salesman 3");
            for(int j=0;j<3;j++){
                sm3[j]=sc.nextInt();
                s3=s3+sm3[j];
            }
            System.out.println("Enter the sales of 3 items sold by salesman 4");
            for(int j=0;j<3;j++){
                sm4[j]=sc.nextInt();
                s4=s4+sm4[j];
            }
            System.out.println("Enter the sales of 3 items sold by salesman 5");
            for(int j=0;j<3;j++){
                sm5[j]=sc.nextInt();
                s5=s5+sm5[j];
            }
                
            
            int item1=0,item2=0,item3;
            item1=sm1[0]+sm2[0]+sm3[0]+sm4[0]+sm5[0];
            item2=sm1[1]+sm2[1]+sm3[1]+sm4[1]+sm5[1];
            item3=sm1[2]+sm2[2]+sm3[2]+sm4[2]+sm5[2];
            System.out.println("Total sales by saleman1="+s1);
            System.out.println("Total sales by saleman2="+s2);
            System.out.println("Total sales by saleman3="+s3);
            System.out.println("Total sales by saleman4="+s4);
            System.out.println("Total sales by saleman5="+s5);
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
