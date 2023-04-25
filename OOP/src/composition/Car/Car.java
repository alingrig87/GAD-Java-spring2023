package composition.Car;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        Engine engine = new Engine("electric", 400);
        Car car = new Car("Tesla", "Model 3", engine);

        System.out.println("Model: " + car.getModel());
        System.out.println("Engine type: " + car.getEngine().getType());
        System.out.println("Engine horsepower: " + car.getEngine().getHorsepower());
    }
}
