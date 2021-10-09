
public class FillPetrol implements CarState{
	
	
	Car car;
	public FillPetrol(Car car)
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
	}
	public void fillPetrol()
	{
		System.out.println("Needs refil of Petrol Tank");
	}
	
	public String toString() 
	{
		return "  ***Fill Petrol State***";
	}
}