package Car;
public class Car {
    private String brand;
    private String model;
    private String engineVolume;
    private String color;
    private String productionYear;
    private String productionCountry;

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public String getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }

    public Car(String brand, String model, String productionYear, String productionCountry, String color, String engineVolume) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume != null) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = "1.5";
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (productionYear != null) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = "2000";
        }
        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
    }



    @Override
    public String toString() {
        return brand + ", " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", цвет " + color + ", объем двигателя " + engineVolume;
    }
}
