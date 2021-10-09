
public class StopCarState implements CarState{
	
	Car car;
	public StopCarState(Car car)
	{
		this.car = car;
	}

	public void stopCarState()
	{
		System.out.println("Car is in stop state");
		car.setState(car.getHasPetrol());
	}
	
	public void hasPetrol()
	{
		System.out.println("Check Petrol");
	}
	public void startCarState()
	{
		System.out.println("Car is not in start state");
	}
	public void movingCarSatte()
	{
		System.out.println("Car is not moving");
	}
	public void fillPetrol()
	{
		System.out.println("Do not need to fill the petrol");
	}
	
	public String toString() 
	{
		return "  ***Stop Car State***";
	}

}
