package com.pack1;

public class Pattern5 {
       public void pattern5()
       {
    	   int n=5;                        
    	for(int i=1;i<=n;i++)             
    	   {
    		   for(int j=1;j<=(n-i)+1;j++)
    		   {
    			   System.out.print("* ");
    		   }
    		   System.out.println("  ");
    	   }
       }
	public static void main(String[] args) {
		Pattern5 p5=new Pattern5();
		p5.pattern5();

	}

}
