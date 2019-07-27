import java.util.*;
class multiples
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       int i,s=0;
       for(i=1;i<1000;i++)
           {if((i%3==0)||(i%5==0))
           s=s+i;
        }
       System.out.println("Sum="+s);
    }
}