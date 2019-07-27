class question7
{
    public static void main(String args[])
    {
        int i=2,c=1,j,t=0;
        while(c<=10001)
        {
            t=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    t=1;
                    break;
                }
            }
            i++;
            if(t==0)
            c++;
        }
        System.out.println("The 10001st prime number is:"+(i-1));
    }
}
    