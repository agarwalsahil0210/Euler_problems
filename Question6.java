class Question6
{
    //*******************************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the difference of square of sum and sum of squares of 1 to 100
    //*******************************************************************************
    public static void main(String args[])
    {
    int s1=0,s2=0,i;
    s2=(100*101)/2;
    s1=(100*101*201)/6;
    System.out.println("Difference:"+((s2*s2)-s1));
}
}