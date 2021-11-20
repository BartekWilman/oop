public class Opel extends Vehicle {

    public Drive naped;
    public Opel(int dateOfProduction, String model, boolean airCon, int mileage, Drive drive){
        super(dateOfProduction, model, airCon, mileage);
        this.naped = drive;

    }
}
