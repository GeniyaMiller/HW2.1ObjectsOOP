import Transport.Bus;
import Transport.Car;
import Flower.Flower;
import Bouquet.Bouquet;
import Transport.Car.Key;
import Transport.Car.Insurance;
import Transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 35, null);
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджера");
        Human anya = new Human("Аня", "Москва", -5, "методиста");
        Human artem = new Human("Артем", "Москва", 27, "директора по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, "нигде не работаю");
        System.out.println(vladimir);


        System.out.println(anya);
        maxim.setTown(null);
        System.out.println(anya);
        System.out.println(artem);
        System.out.println(maxim);
        System.out.println();


        Flower rose = new Flower("Rose", "Gollandiya", null, 35.59, 0);
        Flower hrizantema = new Flower("Hrizanrema", null, null, 15.00, 5);
        Flower pion = new Flower("Pion", "England", null, 69.9, 1);
        Flower gupsofila = new Flower("Gupsofila", "Turcey", null, 19.5, 10);

        rose.showInfo();
        hrizantema.showInfo();
        pion.showInfo();
        gupsofila.showInfo();
        System.out.println();


        Flower[] flowers = new Flower[9];
        flowers[0] = rose;
        flowers[1] = rose;
        flowers[2] = rose;
        flowers[3] = gupsofila;
        flowers[4] = hrizantema;
        flowers[5] = hrizantema;
        flowers[6] = hrizantema;
        flowers[7] = hrizantema;
        flowers[8] = hrizantema;
        Bouquet b = new Bouquet(flowers);
        System.out.println(b.getExpiryDays(flowers));
        System.out.printf("%.2f", b.getCost(flowers));

        System.out.println();
        System.out.println();
        System.out.println("AVTO");


        Key key = new Key(true, true);

        Insurance insuranceAudi = new Insurance(LocalDate.of(2022, 9, 15), 12000, "948371653");
        Insurance insuranceLada = new Insurance(LocalDate.of(2023, 10, 17), 12000, "7436r5362");
        Insurance insuranceBmw = new Insurance(LocalDate.of(2023, 3, 1), 12000, "957364524");
        Insurance insuranceKia = new Insurance(LocalDate.of(2023, 1, 7), 12000, "999666777");
        Insurance insuranceHyundai = new Insurance(LocalDate.of(2022, 9, 3), 12000, "111222333");

        Car audi = new Car("Audi", "A8", 2020, "Германия", "Зеленый", 230, 3.0, "механическая", "кроссовер", "D444GD234", 5, 1, key, insuranceAudi, "electric");
        audi.refill(audi.getTypeMotor());
        Car lada = new Car("Lada", "Grande", 2015, "России", "желтого", 250, 1.7, "автомат", "седан", "A345AA345", 5, 1, key, insuranceLada, null);
        lada.refill(lada.getTypeMotor());
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 210, 3.0, "автомат", "минивен", "H121AS123", 3, 0, key, insuranceBmw, "diesel");
        bmw.refill(bmw.getTypeMotor());
        Car kia = new Car("Kia", "Sportage 4", 2018, "Южной Корее", "красный", 240, 2.4, "автомат", "седан", "G985HJ345", 2, 1, key, insuranceKia, "petrol");
        kia.refill(kia.getTypeMotor());
        Car hyundai = new Car("Hyundai", "Avant", 2016, "Южной Корее", null, 280, 1.6, "механическая", "кроссовер", "G872LR855", 7, 2, key, insuranceHyundai, null);
        hyundai.refill(hyundai.getTypeMotor());

        System.out.println(audi);
        System.out.println(lada);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();
        System.out.println("TRAIN");

        Train lastochka = new Train("Lastochka", "B-901", 2001, "Россия", null, 301, 3500, 0, "Белорусский вокзал", "Минск - Пассажирский", 11, "diesel");
        lastochka.refill(lastochka.getTypeMotor());
        Train leningrad = new Train("Leningrad", "D-125", 2019, "Россия", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград - Пассажирский", 8, null);
        leningrad.refill(leningrad.getTypeMotor());
        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus mers = new Bus("Mercedes", "M-45", 2010, "Germany", "red", 190, "petrol");
        mers.refill(mers.getTypeMotor());
        Bus wv = new Bus("WV", "AM21", 2003, "Germany", "blue", 180, "diesel");
        wv.refill(wv.getTypeMotor());
        Bus opel = new Bus("Opel", "S8", 2020, "Korea", "black", 210, "petrol");
        opel.refill(opel.getTypeMotor());

        System.out.println(mers);
        System.out.println(wv);
        System.out.println(opel);


    }

}