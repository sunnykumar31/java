import java.util.Scanner;
public class array2d {
    void func(){
        try{
            Scanner sc=new Scanner(System.in);
            int marks[][]=new int[4][5];
            System.out.println("Enter the marks");
            for(int i=0;i<4;i++){
                for(int j=0;j<5;j++){
                    marks[i][j]=sc.nextInt();
                }
            }
            System.out.println("\n\n*************************\n\n");
            
            
            for(int i=0;i<5;i++){
                float s=0;
                for(int j=0;j<4;j++){
                  s+=marks[j][i];  
                }
                System.out.print("The average marks obtained in each subject"+i);
                System.out.println("="+s*(1.0)/(4.0));
            }
            System.out.println("\n\n*************************\n\n");
            
            
            for(int i=0;i<4;i++){
                float s=0;
                for(int j=0;j<5;j++){
                  s+=marks[i][j];
                }
                System.out.print("The average marks obtained by each student"+i);
                System.out.println("="+s*(1.0)/(5.0));
                
            }
            System.out.println("\n\n*************************\n\n");
            
            
            for(int i=0;i<4;i++){
                float s=0;
                for(int j=0;j<5;j++){
                   s+=marks[i][j];  
                }
                s=s/5;
                if(s<50){
                    System.out.print("The below 50 in their average"+i);
                    System.out.println("="+s);
                }
                
            }
            System.out.println("\n\n*************************\n\n");
            
            
            for(int i=0;i<4;i++){
                int s=0;
                for(int j=0;j<5;j++){
                  s+=marks[i][j];  
                }
                System.out.print("The  marks obtained by student"+i);
                System.out.println("="+s);
            }
        }
        
        catch(Exception e){
            System.out.println("problem occurred at input time"+e);
        }
    }
    public static void main(String args[]){
        
        
        array2d obj=new array2d();
        obj.func();
        
    }
}
