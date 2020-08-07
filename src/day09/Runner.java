package day09;

public class Runner {

	public static void main(String[] args) {


		CarSeller car1= new CarSeller ("Opel", "Astra", 2000,120000, "white", 5000);
		CarSeller car2 = new CarSeller("Honda", "Accord", 2017, 120000, "red", 11000);
		CarSeller car3 = new CarSeller("Honda", "Civic", 2018, 85000,"white",7000);
		CarSeller car4 = new CarSeller("Dodge", "Nitro",2019,45000,"grey",17000);
		CarSeller car5 = new CarSeller("Honda", "Accord",2020,20000,"white",15000);
		CarSeller car6 = new CarSeller("Honda", "City",2010,120000,"white",5000);

		car1.carPrinter(car1);
		car2.carPrinter(car2);
		car3.carPrinter(car3);
		car4.carPrinter(car4);
		car5.carPrinter(car5);
		car5.carPrinter(car6);
		
		
		
	}

}
