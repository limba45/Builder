
public class Cars {
	
	
	private String company;
	private String model;
	private String type;
	private String power;
	
	public Cars(String company, String model, String type, String power) {
		super();
		this.company = company;
		this.model = model;
		this.type = type;
		this.power = power;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getPower() {
		return power;
	}
	
	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return " \n ****** Company ==> " + company + " \n ****** Model ==> " + model + " \n ******* Type ==> " + type + " \n ******* Power ==> " + power;
	}

}
