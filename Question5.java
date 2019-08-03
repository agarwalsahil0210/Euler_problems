import java.util.*;
class Question5
{
    //******************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the smallest multiple of all numbers from 1 to 20
    //******************************************************************
    public static void main(String args[])
    {
        int i,n=2520,t=0;
        while(t!=1)
        {
            for(i=11;i<=20;i++)
            {
                if(n%i!=0)
                break;
                else if(i==20)
                {
                    System.out.println("Smallest multiple of all the numbers from 1 to 20 is :"+n);
                    t=1;
                    break;
                }
            }
            n=n+20;
        }
    }
}