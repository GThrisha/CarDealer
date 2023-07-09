package cardealer;
import java.util.*;
public class CarsUse {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        Cars[] cars = {
                new Cars("Polo Trendline", 870000),
                new Cars("Polo Highline", 1009000),
                new Cars("Virtus Trendline", 1105000),
                new Cars("Virtus Highline", 1308000),
                new Cars("Taigun Trendline", 1489000),
                new Cars("Taigun Highline", 1542000),
                new Cars("Taigun Topline", 1771000)
        };
        System.out.println("Car Models:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1) + ". " + cars[i].getCarModel());
        }
        System.out.print("Select car model : ");
        int selectedCarIndex = sc.nextInt() - 1;
        Cars selectedCar = cars[selectedCarIndex];
        
        System.out.print("Do you need Insurance (yes/no): ");
        boolean insurance = sc.next().equalsIgnoreCase("yes");
        
        System.out.print("Do you need Additional Accessories (yes/no): ");
        boolean additionalAccessories = sc.next().equalsIgnoreCase("yes");
        
        System.out.print("Dealer discount (% or rupees, max 30000): "); 
        String discountInput = sc.next();
        double dealerDiscount;
        if (discountInput.endsWith("%")) {
            double discountPercentage = Double.parseDouble(discountInput.substring(0, discountInput.length() - 1));
            dealerDiscount = selectedCar.getShowroomPrice() * (discountPercentage / 100);
            
        } else {
            dealerDiscount = Math.min(Double.parseDouble(discountInput), 30000);
        }
        CarSelection car = new CarSelection(selectedCar, insurance, additionalAccessories, dealerDiscount);
        double totalCost = car.totalCost();
        System.out.println("Selected Car Model: " + selectedCar.getCarModel());

        System.out.println("Total cost: " + totalCost);
		
	}

}
