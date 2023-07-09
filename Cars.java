package cardealer;

public class Cars{
	private String carmodel;
    private double showroomPrice;

    public Cars(String model, double showroomPrice) {
        this.carmodel = model;
        this.showroomPrice = showroomPrice;
    }

    public String getCarModel() {
        return carmodel;
    }

    public double getShowroomPrice() {
        return showroomPrice;
    }

}
