class SecondExample
{
	static void BoxingDemo()
	{
		Object data=123;	//Boxing
		MyConsole.print(data);

		int newdata=(int)data;	//Unboxing
		newdata++;
		data=newdata;
		MyConsole.print(data);		

		data="Testing String Object";
		MyConsole.print(data);

		data=123.578537530;
		MyConsole.print(data);
	}

	static void StringComparison()
	{
		String name="Himanshu";
		String aname="Himanshu";
		//One Method
		MyConsole.print(name==aname);	//True
		//Second Method
		MyConsole.print(name.equals(aname));
	}

	static void HashCodeFunc()
	{
		Object value=123;
		Object avalue=123;
		MyConsole.print(value.hashCode()==avalue.hashCode());
		MyConsole.print(value.hashCode());
		value="123";
		MyConsole.print(value.hashCode());
	}
	public static void main(String[] args) 
	{
		//BoxingDemo();
		//StringComparison();
		HashCodeFunc();
	}
}