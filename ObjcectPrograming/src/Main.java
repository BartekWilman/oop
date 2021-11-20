public class Main {
    public static void main(String[] args) {

//        Car audi = new Car(0, 1, "A6", true);
//        audi.startEngine();
//        audi.setLights(true);
//        System.out.println(audi.getLights());
//        audi.setGear(1);
//        audi.accelerate(20);
//        audi.setGear(2);
//        audi.accelerate(50);
//        audi.accelerate(50);
//        audi.slowDown(40);
//        audi.stopEngine();
//
//        Car toyota = new Car(100, 1, "corolla", true);
//        toyota.startEngine();
//
//        Car opel = new Car();
//        opel.startEngine();
//
//        Car fiat = new Car(0, 1, "126p", true);
//
//

Toyota corolla = new Toyota(2019, "corolla hybrid", true, 10, "leather");
corolla.startEngine();


Vehicle vehicle = new Vehicle(2000, "ok", true, 999999 );
vehicle.startEngine();

Opel astra = new Opel(2013, "H", true, 12000, Drive.FWD);
astra.startEngine();


Cat kot = new Cat();
kot.sound();
kot.sleep();

Dog pies = new Dog();
pies.sound();
pies.sleep();
    }
}