
public class CarBuilder {
	
	private String company;
	private String model;
	private String type;
	private String power;
	
	
	public CarBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public CarBuilder setType(String type) {
		this.type = type;
		return this;
	}
	
	public CarBuilder setPower(String power) {
		this.power = power;
		return this;
	}
	
	public Cars getCars() {
		return new Cars(company, model, type,power);
	}

}
