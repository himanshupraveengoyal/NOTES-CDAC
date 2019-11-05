class Assignment1
{
	static int MaximumValue(int[] a)
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

	static int MinimumValue(int[] a)
	{
		int min=1000;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}

	static int AverageValue(int[] a)
	{
		int sum=0;
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum/n;
	}

	static int[] ReverseNumbers(int[] a)
	{
		int n=a.length;
		int b[]=new int[n];
		int j=0;
		for(int i=n-1;i>=0;i--)
		{				
			b[j]=a[i];
			j++;		
		}
		return b;
	}

	public static void main(String[] args) 
	{
		int n = MyConsole.getNumber("Enter Total Number Of Elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i] = MyConsole.getNumber("Enter The Value:");
		int MaxValue=MaximumValue(a);
		System.out.println("Maximum Value:"+MaxValue);
		int MinValue=MinimumValue(a);
		System.out.println("Minimum Value:"+MinValue);
		int AvgValue=AverageValue(a);
		System.out.println("Average Value:"+AvgValue);
		int[] b=ReverseNumbers(a);
		for(int i=0;i<n;i++)
			System.out.println(b[i]);
	}
}