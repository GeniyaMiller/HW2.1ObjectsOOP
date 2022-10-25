import Transport.Car;
import Flower.Flower;
import Bouquet.Bouquet;
import Transport.Car.Key;
import Transport.Car.Insurance;

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


        Key key = new Key (true, true);

        Insurance insuranceAudi = new Insurance(LocalDate.of(2022,9,15), 12000, "948371653");
        Insurance insuranceLada = new Insurance(LocalDate.of(2023,10,17), 12000, "7436r5362");
        Insurance insuranceBmw = new Insurance(LocalDate.of(2023,3,1), 12000, "957364524");
        Insurance insuranceKia = new Insurance(LocalDate.of(2023,1,7), 12000, "999666777");
        Insurance insuranceHyundai = new Insurance(LocalDate.of(2022,9,3), 12000, "111222333");

        Car audi = new Car("Audi", "A8", 2020, "Германия", "Зеленый", 3.0, "механическая", "кроссовер", "D444GD234", 5, 1, key, insuranceAudi);
        Car lada = new Car("Lada", "Grande", 2015, "России", "желтого", 1.7, "автомат", "седан", "A345AA345", 5, 1, key, insuranceLada);
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 3.0, "автомат","минивен","H121AS123",3 , 0, key, insuranceBmw);
        Car kia = new Car("Kia", "Sportage 4", 2018, "Южной Корее", "красный", 2.4, "автомат","седан","G985HJ345",2 , 1, key, insuranceKia);
        Car hyundai = new Car("Hyunday", "Avante", 2016, "Южной Корее", null, 1.6, "механическая", "кроссовер","G872LR855", 7 ,2, key, insuranceHyundai);
        System.out.println(insuranceKia);


        System.out.println(audi);
        System.out.println(lada);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}