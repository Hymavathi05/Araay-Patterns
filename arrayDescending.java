package com.pack1;
public class arrayDescending {
      public void array_aescending()
      {
    	  boolean isSorted=true;
    	  int [] arr= {29,27,28,31,3};
    	  for(int i=0;i<arr.length-1;i++)
    	  {
    		  if(arr[i]<arr[i+1])
    		  {
    			  isSorted=false;
    			  break;
    		  }
    	  }
    	  if(isSorted)
    	  {
    		  System.out.println("Array is in Dscending order");
    	  }
    	  else
    	  {
    		  System.out.println("Array is not in Dscending order");
    	  }
      }
	public static void main(String[] args) {
		arrayDescending ad=new arrayDescending();
		ad.array_aescending();
	}

}

