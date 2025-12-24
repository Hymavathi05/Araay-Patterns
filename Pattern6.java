package com.pack1;
public class Pattern6 {
            public void pattern6()
            {
            	int n=5;
            	for(int i=1;i<=n;i++)
            	{
            		for(int j=1;j<=(n-i);j++)
            		{
            			System.out.print("  ");
            		}
            		for(int j=1;j<=(2*i)-1;j++)
            		{
            			System.out.print("* ");
            		}
            		System.out.println();
            	}
            }
            public static void main(String[] args) {
		       Pattern6 p6=new Pattern6();
		       p6.pattern6();
}
}
