package base;

public class MyInteger 
{

	private int Ivalue;
	
	public MyInteger(int newValue) 
	{
		Ivalue = newValue;
	}
	public int getIvalue() 
	{
		return Ivalue;
	}
	public static boolean isEven(int num) 
	{
		if ((num %2)==0)
		{
			return true;
		}
		else 
		{ 
			return false;
		}
	}
	
	public static boolean isOdd(int num) 
	{
		if ((num%2)!=0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}	
	
	public static boolean isPrime(int num)
	{
		if (num == 1)
		{
			return false;
		}
		for (int prime=2; prime < num ; prime ++)
		{
			if (num  % prime ==0 )
			{
		return false;
			}
		
		}
		
	return true;
	}

	public boolean isEven()
	{
		return isEven(Ivalue);
	}
	
	public boolean isOdd()
	{
		return isOdd(Ivalue);
	}
	public boolean isPrime()
	{
		return isPrime (Ivalue);
	}
	
	public static boolean isEven(MyInteger num)
	{
		return num.isEven();
	}
	public static boolean isOdd(MyInteger num)
	{
		return num.isOdd();
	}
	public static boolean isPrime(MyInteger num)
	{
		return num.isPrime();
	}
	public boolean isEquals( int i )
	{
			return ( Ivalue == i);
	}
	public boolean isEquals ( MyInteger i)
	{
		return isEquals(i.getIvalue());
	}
}


	
			

