package cardealer;

public class CarSelection {
	private Cars car;
    private double dealerDiscount;
    private boolean insurance;
    private boolean addAccessories;

    public CarSelection(Cars car, boolean insurance, boolean addAccessories, double dealerDiscount) {
        this.car = car;
        this.dealerDiscount = dealerDiscount;
        this.insurance = insurance;
        this.addAccessories = addAccessories;
    }
    public double totalCost() {
        double cost= car.getShowroomPrice();
        double totalCost;
        
        double rto = 113990;
        double insuranceCost = insurance ? 47300 : 0;
        double tcsCharges = 11000;
        double addAccessoriesCost = addAccessories ? 15000 : 0;
        double discount = Math.min(dealerDiscount, 30000);
        totalCost = cost+rto + insuranceCost + tcsCharges + addAccessoriesCost - discount;
        return totalCost;
    }
}
