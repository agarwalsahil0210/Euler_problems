import java.util.*;
class smallest_multiple
{
    public static void main(String args[])
    {
        int i,n=1,t=0;
        while(true)
        {
            for(i=1;i<=20;i++)
            {
                if(n%i!=0)
                break;
                else if(i==20)
                {
                    t=1;
                }
            }
            n++;
            if(t==1)
            {
                System.out.println("Smallest multiple of all the numbers from 1 to 20 is :"+(n-1));
                break;
            }
        }
    }
}