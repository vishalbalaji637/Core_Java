package com.poly;

public class Poly
{
	   public void sum(int x, int y)
	    {
	        System.out.println(x + y);
	    }
	  	    
	    public void sum(int x, int y, int z)
	    {
	        System.out.println(x + y + z);
	    }
	     
	    public void sum(double x, double y)
	    {
	        System.out.println(x + y);
	    }
public static void main(String[] args)
{
	  {
		  Poly plt = new Poly();
	        plt.sum (10, 20);
	        plt.sum(10, 20, 30);
	       plt.sum(10.5, 20.5);
	    }
	}
}	


