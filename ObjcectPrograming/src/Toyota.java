public class Toyota extends Vehicle {

    private String typeOfSeats;


    public Toyota(int dateOfProduction, String model, boolean airCon, int mileage, String typeOfSeats){
        super(dateOfProduction, model, airCon, mileage);

        this.typeOfSeats = typeOfSeats;

    }
    @Override
    public void startEngine(){
        System.out.println("Start toyota engine");

    }
}
