class Question10
{
    //****************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the sum of all primes less than 2000000
    //****************************************************************
    public static void main(String args[])
    {
        int i,j,c=0;long s=0;
        for(i=2;i<2000000;i++)
        {
            for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                c=1;
            }
            if(c==0)
            s=s+i;
            c=0;
        }
        System.out.println("Sum of all primes less than 2000000 is :"+s);
    }
}
              
        
        
    