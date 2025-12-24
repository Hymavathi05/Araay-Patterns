package com.pack1;
public class Pattern7 {
          public void pattern7()
          {
        	  int n=5;
        	  for(int i=5;i>0;i--)
        	  {
        		  for(int j=1;j<=(n-i);j++)
        		  {
        			  System.out.print("  ");
        		  }
        		  for(int k=1;k<=(2*i)-1;k++)
        		  {
        			  System.out.print("* ");
        		  }
        		  System.out.println();
        	  }
          }
	public static void main(String[] args) {
		Pattern7 p7=new Pattern7();
        p7.pattern7();
	}

}
