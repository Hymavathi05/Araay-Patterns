package com.pack1;
public class Pattern8 {
     public void pattern8()
     {
    	 int n=5;
    	 for(int i=1;i<=n;i++)
    	 {
    		 for(int j=1; j<=(n-i);j++)
    		 {
    			 System.out.print("  ");
    		 }
    		 for(int k=1;k<=(2*i)-1;k++)
    		 {
    			 System.out.print("* ");
    		 }
    		 System.out.println();
    	 }
    	 for(int i=5;i>0;i-- )
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
	Pattern8 p8=new Pattern8();
	p8.pattern8();
	}

}
