package Day4;

import Day3.MyConsole;

interface NewCar
{
	void NoOfSeats();
	void CarType();
	void CarName();
	default void AirBags()
	{
		MyConsole.Print("0 Air Bags");
	}
}
class NewAlto implements NewCar
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

	@Override
	public void CarName() 
	{
		MyConsole.Print("Maruti Suzuki:Alto");
		
	}
	
}
class NewScorpio implements NewCar
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
	
	@Override
	public void AirBags()
	{
		MyConsole.Print("6 Air Bags");
	}

	@Override
	public void CarName() 
	{
		MyConsole.Print("Mahindra:Scorpio");
	}
}
public class InterFaceNewFeatures 
{

	public static void main(String[] args) 
	{
		NewCar car=new NewAlto();
		car.CarName();
		car.NoOfSeats();
		car.CarType();
		car=new NewScorpio();
		car.CarName();
		car.NoOfSeats();
		car.CarType();
		car.AirBags();
	}

}
