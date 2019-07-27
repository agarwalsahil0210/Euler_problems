import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=1,b=2,c=0,sum=2;
        while(c<4000000)
        {
            c=a+b;
            if(c%2==0)
            sum=sum+c;
            a=b;
            b=c;
        }
        System.out.println("Sum="+sum);
    }
}