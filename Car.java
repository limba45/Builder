
public class Car {
	
	CarState stopcarstate;
	CarState haspetrol;
	CarState startcarstate;
	CarState movingcarstate;
	CarState fillpetrol;
	
	CarState state;
	
	public Car()
	{
		stopcarstate = new StopCarState(this);
		haspetrol = new HasPetrol(this);
		startcarstate = new StartCarState(this);
		movingcarstate = new MovingCarState(this);
		fillpetrol = new FillPetrol(this);
		
		state = stopcarstate;
		
	}
	
	public void startCarState()
	{
		state.startCarState();
	}
	public void hasPetrol()
	{
		state.hasPetrol();
	}
	public void stopCarState()
	{
		state.stopCarState();
	}
	public void movingCarState()
	{
		state.movingCarSatte();
	}
	public void fillPetrol()
	{
		state.fillPetrol();
	}
	
	
	
	void setState(CarState state) 
	{
		this.state = state;
	}
	public CarState getState() 
	{
        return state;
    }

    public CarState getStopCarState() 
    {
        return stopcarstate;
    }

    public CarState getHasPetrol() 
    {
        return haspetrol;
    }
    public CarState getStartCarState() 
    {
        return startcarstate;
    }
    public CarState getFillPetrol() 
    {
        return fillpetrol;
    }
    public CarState getMovingCarState() 
    {
        return movingcarstate;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\n!!!!!!! Car Petrol State  !!!!!!.");
		
		result.append("Car is in " + state + "\n");
		return result.toString();
	}
	

}
