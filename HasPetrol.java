
public class HasPetrol implements CarState{
	
	Car car;
	public HasPetrol(Car car)
	{
		this.car = car;
	}
	


	public void stopCarState()
	{
		System.out.println("Car is in stop state");
	}
	
	public void hasPetrol()
	{
		System.out.println("Car has Petrol");
		car.setState(car.getStartCarState());
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
		return "  ***Has Petrol State***";
	}


}
