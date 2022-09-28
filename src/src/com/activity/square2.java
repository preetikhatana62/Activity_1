package com.activity;
interface I1
{
    public int sum(int a,int b,int c);	
}

public class square2
  {   

public static void main(String[] args)
{ I1 i=(a,b,c)->(a+b+c);
System.out.println(i.sum(2,3,5))
;
	
}
  }

