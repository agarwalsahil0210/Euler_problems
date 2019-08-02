class Question7
{
    //****************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the 10001st prime number
    //****************************************************************
    public static void main(String args[])
    {
        int i=3,c=2,j,t=0;
        while(c<=10001)
        {
            t=0;
            for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    t=1;
                    break;
                }
            }
            i=i+2;
            if(t==0)
            c++;
        }
        System.out.println("The 10001st prime number is:"+(i-2));
    }
}
    