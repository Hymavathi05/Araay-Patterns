package com.pack1;
public class arrayAsecending {
	public void array_aescending()
    {
  	  boolean isSorted=true;
  	  int [] arr= {11,27,29,31,3};
  	  for(int i=0;i<=arr.length-1;i++)
  	  {
  		  if(arr[i]>arr[i+1])
  		  {
  			  isSorted=false;
  			  break;
  		  }
  	  }
  	  if(isSorted)
  	  {
  		  System.out.println("Array is in Ascending orde");
  	  }
  	  else
  	  {
  		  System.out.println("Array is not in Ascending order");
  	  }
    }
	public static void main(String[] args) {
		arrayAsecending ad=new arrayAsecending();
		ad.array_aescending();
	}
}
