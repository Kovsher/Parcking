public class CarWV extends Car {


    Car CarWV = new Car("red", false, 1500,false);


    public CarWV(String color, Boolean automatic, int weight, boolean trailer, Car carWV) {
        super(color, automatic, weight, trailer);

    }

    public Car getCarWV() {
        return CarWV;
    }

    public void setCarWV(Car carWV) {
        CarWV = carWV;
    }
}
