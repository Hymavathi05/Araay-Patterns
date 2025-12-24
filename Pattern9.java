package com.pack1;
public class Pattern9 {
        public void pattern9()
        {
        	int rows=4;
        	int columns=6;
        	for(int i=1;i<=rows;i++)
        	{
        		for(int j=1;j<=columns;j++)
        		{
        			if(i==1 || i==rows || j==1 || j==columns)
        			{
        				System.out.print("* ");
        			}
        			else
        			{
        				System.out.print("  ");
        			}
        		}
        		System.out.println();
        	}
        }
	public static void main(String[] args) {
		Pattern9 p9=new Pattern9();
		p9.pattern9();

	}

}
