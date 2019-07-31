class Question9
{
    //****************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the product of special pythagorean triplets
    //****************************************************************
    public static void main(String args[])
    {
        int i,j,k;double sum;
        for(i=1; i<1000; i++)
        {
            for(j=i+1; j<1000; j++)
            {
                sum=Math.pow(i,2)+Math.pow(j,2);
                k=1000-i-j;
                if(sum==(Math.pow(k,2)))
                {
                    System.out.println("Product of special pythagorean triplets is:"+(i*j*k));
                    break;
                }
            }
        }         
    }
}