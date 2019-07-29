public class Question3
 {
    //****************************************************************
    //*Author: Sahil Agarwal
    //*Purpose:To find the largest prime factor of 600851475143
    //****************************************************************
	public static void main(String[] args)
	{
	   double num=600851475143.0;
	   double temp=num;
	   double max;
	    for(int i=2;i<num;i++) 
		 {
	         while(num%i == 0)
	         {
	            System.out.println(i+" ");
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