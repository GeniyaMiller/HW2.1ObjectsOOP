package Transport;

import java.time.LocalDate;

public class Car {
    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }
    public static class Insurance {
        private LocalDate validity;
        private int cost;
        private String number;


        @Override
        public String toString() {
            return "Insurance{" +
                    "validity=" + validity +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        public Insurance(LocalDate validity, int cost, String number) {
            if (validity.isBefore(LocalDate.now())){
                System.out.println("Необходимо срочно оформить новую страховку");
                return;
            }
            this.validity = validity;
            if (cost >= 0) {
                this.cost = cost;
            } else {
                System.out.println("Ошибка ввода данных!");
            }
            if (number.matches("[0-9]{9}")){
                this.number = number;
            } else {
                System.out.println("Номер страховки некорректный!");
            }

        }

        public LocalDate getValidity() {
            return validity;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String boxOfTransfers;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private int wheels; //0 == summer, 1 == winter

    private Key key;
    private Insurance insurance;
    public Car(String brand, String model, Integer productionYear, String productionCountry, String color,
               double engineVolume, String boxOfTransfers, String bodyType, String registrationNumber,
               int numberOfSeats, int wheels, Key key, Insurance insurance) {
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

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
            return;
        }
        this.bodyType = bodyType;

        if (numberOfSeats <= 0 || numberOfSeats > 7) {
            this.numberOfSeats = 5;
            return;
        }
        this.numberOfSeats = numberOfSeats;

        setColor(color);
        setEngineVolume(engineVolume);
        setBoxOfTransfers(boxOfTransfers);
        setRegistrationNumber(registrationNumber);
        setWheels(wheels);
        setKey(key);
        setInsurance(insurance);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
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
    public int getWheels() { return wheels; }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getBoxOfTransfers() {
        return boxOfTransfers;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
            return;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
            return;
        }
        this.color = color;
    }
    public void setBoxOfTransfers(String boxOfTransfers) {
        if (boxOfTransfers == null || boxOfTransfers.isEmpty() || boxOfTransfers.isBlank()) {
            this.boxOfTransfers = "default";
            return;
        }
        this.boxOfTransfers = boxOfTransfers;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Неверный формат номера";
        }
    }

    public void setWheels(int wheels) {
        if(wheels == 0 || wheels == 1) {
            this.wheels = wheels;
            return;
        }
        this.wheels = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", boxOfTransfers='" + boxOfTransfers + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", wheels=" + wheels +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }
}
