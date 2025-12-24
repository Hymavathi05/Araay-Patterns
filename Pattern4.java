package com.pack1;

public class Pattern4 {
      public void pattern4()
      {
    	  int n=5;
    	  for(int i=1;i<=n;i++)
    	  {
    		  for(int j=1;j<=i;j++)
    		  {
    			  System.out.print("* ");   /* 
    			                               Output:
    			                            *   
                                            * *   
                                            * * *   
                                            * * * *   
                                            * * * * *
    			                         */
    		  }
    		  System.out.println("  ");
    	  }
      }
	public static void main(String[] args) {
		Pattern4 p4=new Pattern4();
		p4.pattern4();

	}

}
