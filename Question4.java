public class Question4
 {
    //******************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the largest palindrome product of 3 digit numbers
    //******************************************************************

	public static void main(String[] args)
	{
		 int max=-1,num=1;
			for(int i=999;i>=100;i--)
			{
				for(int j=999;j>=100;j--)
				{
				     num= (i*j);
					 int t=num;
						if (ispalindrome(num) && num>max)
						max = t;
				 }
			}
			System.out.println("Largest palinmdrome product is :"+max);
		}
	       public static boolean ispalindrome(int x) 
	       {
	        int rem,rev=0,t=x;
			while(x>0) 
			{
			    rem=x%10;
				rev=rev*10+rem;	
				x=x/10;
			   }
			return  t==rev;

	}

}