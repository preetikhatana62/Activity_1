package com.activity;
interface I2
{
	public int mul(int a,int b);
}
public class multiplication {
	public static void main(String[] args) 
	{
		I2 i2= (a,b)->(a*b);
		System.out.println(i2.mul(5, 5));
	}

}
