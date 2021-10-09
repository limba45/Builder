
public class StartCarState implements CarState{
	
	
	Car car;
	public StartCarState(Car car)
	{
		this.car = car;
	}
	
	
	public void stopCarState()
	{
		System.out.println("Car is not in stop state");
	}
	
	public void hasPetrol()
	{
		System.out.println("Car has Petrol");
	}
	public void startCarState()
	{
		System.out.println("Car has started");
		car.setState(car.getMovingCarState());
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
		return "  ***Start Car State***";
	}

	

}
