public class vehicle {
    private int dateOfProduction;
    private String model;
    private boolean airCon;
    private int mileage;

    public void startEngine(){
        System.out.println("Silnik działa");
    }

    public void stopEngine(){
        System.out.println("Silnik zgasł");
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAirCon() {
        return airCon;
    }

    public void setAirCon(boolean airCon) {
        this.airCon = airCon;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
