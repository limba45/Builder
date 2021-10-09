
public class TestState {

	public static void main(String[] args) 
	{
		
		
		
		
		
		Cars Prius = new CarBuilder().setCompany("Toyota").setModel("2019").setType("Sedan").setPower("1800").getCars();
		Cars Sportage = new CarBuilder().setCompany("KIA").setModel("2020").setType("Crossover").setPower("1500 Turbo").getCars();
		Cars Tucson = new CarBuilder().setCompany("Hyundai").setModel("2020").setType("Crossover").setPower("1500 Turbo").getCars();
		Cars Ciaz = new CarBuilder().setCompany("Suzuki").setModel("2018").setType("Sedan").setPower("1600").getCars();
		
		System.out.println("Car ==> "+ Prius);
		System.out.println("Car ==> "+ Sportage);
		System.out.println("Car ==> "+ Tucson);
		System.out.println("Car ==> "+ Ciaz);
		
		System.out.println("\n=================================================================================\n=================================================================================\n");
		
		
		
		
		
		Car car = new Car();
		
		System.out.println(car);
		car.stopCarState();
		System.out.println(car);
		car.hasPetrol();
		System.out.println(car);
		car.startCarState();
		System.out.println(car);
		car.movingCarState();
		System.out.println(car);
		car.fillPetrol();
		System.out.println(car);
		

	}

}
