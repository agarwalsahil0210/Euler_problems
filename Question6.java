class Question6
{
    //*******************************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the difference of square of sum and sum of squares of 1 to 100
    //*******************************************************************************
    public static void main(String args[])
    {
    int s1=0,s2=0,i;
    for(i=1;i<=100;i++)
    {
        s1=s1+(i*i);
        s2=s2+i;
    }
    System.out.println("Difference:"+((s2*s2)-s1));
}
}