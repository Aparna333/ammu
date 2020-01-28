class A{
	public String method()
	{
	 	return "hi";
	}
}

class B extends A{
	public void method()
	{
		System.out.println("hello");
	}	
}

class Test{

	public static void main(String ar[])
	{
		new B().method();
	}
}


public String toString()
{
	return getClass().getName()+"@"+Integer.toHexString(hashCode());
}
