package com.activity;
interface I3
{
	public int   f1();
}

public class square
{
	
	public static void main(String[] args)
	{
		I3 i=()->{return 5;};
		System.out.println(i.f1());
	}
}
