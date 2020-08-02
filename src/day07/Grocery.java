package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocery {

	static List<String> groceriesList = new ArrayList<>();
	static List<Double> pricesList = new ArrayList<>();
	static List<String> basketGrocery = new ArrayList<>();
	static List<Double> basketWeight = new ArrayList<>();
	static List<Double> basketItemsTotalprice = new ArrayList<>();
	
	
	
	public static void main(String[] args) {

		String groceriesArray []= {"Tomatoes","Potatoes","Pepper","Onion","Carrot", "Apple","Banana","Strawberry","Melon","Grape"};
		for(String each:groceriesArray) {
			groceriesList.add(each);
		}
		
		double priceArray[] = {2.1,3.2,1.5,2.3,3.1,1.2,1.9,6.1,4.3,2.7};
		for(double each:priceArray) {
			pricesList.add(each);
		}
		

		String continiueBuying="y";
		
		do {	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("which grocery do you want ? \nPlease select by number at the beginning");
		printGroceryList();
		int groceryNum = scan.nextInt();
		System.out.println("how many kilograms do you want?");
		
		double weight = scan.nextDouble();
		printGroceryBought(groceryNum, weight);
		
		
		System.out.println("Do you need any other grocery? Y : yes or N:no");
		
		continiueBuying = scan.next();
		addBasket(groceryNum, weight);
		
			
		} while (  continiueBuying.equalsIgnoreCase("y"));
		
		
		printBasket();
	
		
		
 	} // end of main method
	
	public static void printGroceryList() {
		
		System.out.println("Num   Grocery Price");
		System.out.println("====================");
		
		for (int i = 0; i <groceriesList.size() ; i++) {
			
			System.out.println(i + "   " + groceriesList.get(i) +"  " + pricesList.get(i));
		}
		
	}
	
	public static void printGroceryBought(int groceryNum, double weight) {
		
		System.out.println("Num   Grocery weight Total Price");
		System.out.println("================================");
		
			
		System.out.println(groceryNum + "   " + groceriesList.get(groceryNum) +"  " + weight + "  "+pricesList.get(groceryNum)*weight);
	
		
	}
	
	public static void addBasket(int groceryNum, double weight) {
		basketGrocery.add(groceriesList.get(groceryNum));
		basketWeight.add(weight);
		basketItemsTotalprice.add(weight*pricesList.get(groceryNum));
			
		
	}
	
	public static void printBasket() {
		// totalItem, totalWeight, totalPrice
		
		int totalItem = 0;
		double totalWeight =0;
		double totalPrice=0;
		
		System.out.println("Grocery     Weight  Total Price ");
		System.out.println("================================");
		
		for (int i = 0; i < basketGrocery.size(); i++) {
			
			System.out.println(basketGrocery.get(i) + "  " + basketWeight.get(i) + "   " + basketItemsTotalprice.get(i));
			totalItem++;
			totalWeight+=basketWeight.get(i);
			totalPrice+=basketItemsTotalprice.get(i);
		}
		
		System.out.println(totalItem + " groceries  " + totalWeight +"  " + totalPrice);
		
		
	}


} // end of class
