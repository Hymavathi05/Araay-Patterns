package com.pack1;

public class Pattern3 {
     public void pattern3()
     {
    	 int n=3;
    	 for(int i=1;i<=n;i++)
    	 {
    		 for(int j=1;j<=n;j++)
    		 {
    			 System.out.print("* ");      /* 
    			                                    Output:
    			                                    * * *   
                                                    * * *   
                                                    * * *
                                              */

    		 }
    		 System.out.println("  ");
    	 }
     }
	public static void main(String[] args) {
		Pattern3 p3=new Pattern3();
		p3.pattern3();
	}

}
