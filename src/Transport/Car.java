package Transport;

import java.time.LocalDate;

public  class Car extends Transport {


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
                    " " + remoteEngineStart +
                    ",  " + keylessAccess +
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
                    " " + validity +
                    ", " + cost +
                    ", " + number +
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

    private double engineVolume;

    private String boxOfTransfers;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private int wheels; //0 == summer, 1 == winter

    private Key key;
    private Insurance insurance;
    public Car(String brand, String model, Integer productionYear, String productionCountry, String color, int maxSpeed,
               double engineVolume, String boxOfTransfers, String bodyType, String registrationNumber,
               int numberOfSeats, int wheels, Key key, Insurance insurance, String   typeMotor) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, typeMotor);

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

        setEngineVolume(engineVolume);
        setBoxOfTransfers(boxOfTransfers);
        setRegistrationNumber(registrationNumber);
        setWheels(wheels);
        setKey(key);
        setInsurance(insurance);
    }

    @Override
    public void refill(String typeMotor) {
        if (typeMotor == "diesel") {
            System.out.println("Автомобиль " + getBrand() +" следует заправлять дизелем на заправке");
        } if (typeMotor == "petrol") {
            System.out.println("Автомобиль " + getBrand() + " следует заправлять бензином на заправке");
        } if (typeMotor == "electric"){
            System.out.println("Автомобиль " + getBrand() + " следует заряжать на электрод-парковке");
        }
    }

    public double getEngineVolume() {
        return engineVolume;
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
        return "Car" + " " +
                 getBrand() + " " +
                 getModel() + " " +
                 engineVolume + " " +
                 getColor() + " " +
                 getMaxSpeed() + " " +
                 getProductionYear() + " " +
                 getProductionCountry() + " " +
                 boxOfTransfers + " " +
                 bodyType + " " +
                 registrationNumber + " количество сидений " +
                 numberOfSeats + ", резина " +
                 wheels + ", " +
                 key + " " +
                 insurance + " " +
                 getTypeMotor();
    }
}
