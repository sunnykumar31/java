import java.util.Scanner;
public class exstring 
{
    void func()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("input a string");
            String st=sc.next();
            int l=st.length();
            System.out.println("output is:");
            for(int i=0;i<l;i++){
                if( st.charAt(i)== 'a' || st.charAt(i)== 'e' || st.charAt(i)== 'i' || st.charAt(i)== 'o' || st.charAt(i)== 'u' || st.charAt(i)== 'A' || st.charAt(i)== 'E' || st.charAt(i)== 'I' || st.charAt(i)== 'O' || st.charAt(i)== 'U')
                {
                }
                else{
                    System.out.print(st.charAt(i));
                }
            }
        }
        catch(Exception e)
        {
             System.out.println("problem in code");   
        }
            
    }
    public static void main(String ar[])
    {
        exstring obj=new exstring();
        obj.func();
    }

}
