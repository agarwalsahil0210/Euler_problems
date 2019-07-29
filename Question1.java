import java.util.*;
class Question1
{
    //*******************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the sum of all the multiples of 3 and 5 below 1000
    //*******************************************************************
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