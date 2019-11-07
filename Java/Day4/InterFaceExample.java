package Day4;

import Day3.MyConsole;

interface Car
{
	void NoOfSeats();
	void CarType();
}
class Alto implements Car
{

	@Override
	public void NoOfSeats() 
	{
		MyConsole.Print("Four Seater");
	}

	@Override
	public void CarType() 
	{
		MyConsole.Print("Hatch Back");
	}
	
}
class Scorpio implements Car
{

	@Override
	public void NoOfSeats() 
	{
		MyConsole.Print("Six Seater");
	}

	@Override
	public void CarType() 
	{
		MyConsole.Print("SUV");
	}
	
}
public class InterFaceExample 
{
	public static void main(String[] args) 
	{
		Car car=new Alto();
		car.NoOfSeats();
		car.CarType();
		car=new Scorpio();
		car.NoOfSeats();
		car.CarType();
	}
}
