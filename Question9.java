class Question9
{
    //****************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the product of special pythagorean triplets
    //****************************************************************
    public static void main(String args[])
    {
        int i,j,k,a=0,b=0,c=0;
        for(i=1; i<1000; i++)
        {
            for(j=1; j<1000; j++)
            {
                for(k=1; k<1000; k++)
                {
                    if((i+j+k)!=1000)
                    {
                        continue;
                    }
                    if((Math.pow(i,2)+Math.pow(j,2))==Math.pow(k,2))
                    {
                        a=i;
                        b=j;
                        c=k;
                    }
                }
            }
        }
        System.out.print("The product of special pythagorean triplets is:"+(a*b*c));
    }
}