package Transport;

public class Transport {
    private String brand;
    private String model;
    private Integer productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, Integer productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
            return;
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
            return;
        }
        this.model = model;

        if (productionYear <= 0) {
            this.productionYear = 2000;
            return;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty()) {
            this.productionCountry = "default";
            return;
        }
        this.productionCountry = productionCountry;

        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public Integer getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
            return;
        }
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = Math.abs(maxSpeed);
            return;
        }
        this.maxSpeed = maxSpeed;
    }
}
