package day09;

public class CarSeller {
	
	private String brand;
	private String model;
	private int year;
	private int milage;
	private String color;
	private int price;
	
	CarSeller (String brand,String model,int year,int milage,String color,int price){
		
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.milage=milage;
		this.color=color;
		this.price=price;
		
	}
	
	CarSeller (){
		
	}
	

	public static void main(String[] args) {
		/* Print a Java program for Car Seller John;
		 * John has 5 cars whose features are listed below
		 * 1- Toyota Camry, year: 2012, milage:145.000, color :blue, price $10.000
		 * 2- Honda Accord, year: 2017, milage:120.000, color :red, price $11.000
		 * 3- Honda Civic, year: 2018, milage:85.000, color :white,  price $7.000
		 * 4- Dodge Nitro, year:2019, milage:45.000, color :grey,  price $17.000
		 * 5- Honda Accord, year: 2020, milage:20.000, color :white, price $15.000
		 * 
		 * 
		 * print all cars and features in a table
		 * add 2 new cars to the table
		 * change features for car 1
		 * 
		 */
		
		
		CarSeller car1 = new CarSeller();
		
		System.out.println(car1.brand+" "+ car1.price); // null, 0
		car1.brand="Toyota";
		car1.model="Camry";
		car1.year=2012;
		car1.milage=145000;
		car1.color="blue";
		car1.price=10000;
	
		
		
		// 2- Honda Accord, year: 2017, milage:120.000, color :red, price $11.000
		
		CarSeller car2 = new CarSeller("Honda", "Accord", 2017, 120000, "red", 11000);
		//3- Honda Civic, year: 2018, milage:85.000, color :white,  price $7.000
		// * 4- Dodge Nitro, year:2019, milage:45.000, color :grey,  price $17.000
		// * 5- Honda Accord, year: 2020, milage:20.000, color :white, price $15.000
		CarSeller car3 = new CarSeller("Honda", "Civic", 2018, 85000,"white",7000);
		CarSeller car4 = new CarSeller("Dodge", "Nitro",2019,45000,"grey",17000);
		CarSeller car5 = new CarSeller("Honda", "Accord",2020,20000,"white",15000);
		CarSeller car6 = new CarSeller("Honda", "City",2010,120000,"white",5000);



		
		
		carPrinter (car1);
		carPrinter (car2);
		carPrinter (car3);
		carPrinter (car4);
		carPrinter (car5);
		carPrinter (car6);
		
		car1.color="orange";
		carPrinter (car1);
		
		}
	
	public static void carPrinter (CarSeller car) {
		
		System.out.println(car.brand+", "+ car.model+ ", "+ car.year+", "+ car.milage + "km, "
				+ car.color+ ",  $" + car.price);
	}

}
