
public class MovingCarState implements CarState{
	
	
	Car car;
	public MovingCarState(Car car)
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
	}
	public void movingCarSatte()
	{
		System.out.println("Car is moving Now");
		car.setState(car.getFillPetrol());
	}
	public void fillPetrol()
	{
		System.out.println("Do not need to fill the petrol");
	}
	
	public String toString() 
	{
		return "  ***Moving Car State***";
	}
}