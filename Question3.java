public class Question3
 {
    //****************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the largest prime factor of 600851475143
    //****************************************************************
	public static void main(String[] args)
	{
	   long num=600851475143l;
	   long max;
	    for(int i=3;i<Math.sqrt(num);i=i+2) 
		 {
	         while(num%i == 0)
	         {
	            num=num/i;
	         }
	      }
	      if(num>2)
	      {
	         System.out.println(num);
	         max=num;
	         System.out.println("largest prime factor is ="+ max);
	         
	      }
	}

}