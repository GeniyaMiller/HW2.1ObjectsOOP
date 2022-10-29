package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }
    @Override
    public String toString() {
        return "Bus" + " " +
                getBrand() + " " +
                getModel() + ", цвет кузова " +
                getColor() + ", максимальная скорость " +
                getMaxSpeed() + "км/ч, " +
                getProductionYear() + " год, производство " +
                getProductionCountry();
    }

}
