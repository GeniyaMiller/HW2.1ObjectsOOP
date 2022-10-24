import Transport.Car;
import Flower.Flower;
import Bouquet.Bouquet;

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


        Car lada = new Car("Lada", "Grande", 2015, "России", "желтого", 1.7, "автомат", "седан", "A345AA345", 5, 1);
        Car audi = new Car("Audi", "A8", 2020, "Германии", null, 3.0, "механическая", "кроссовер", "F687KK475", 0, 6);
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 3.0, "автомат","минивен","H121AS123",3 , 0);
        Car kia = new Car("Kia", "Sportage 4", 2018, "Южной Корее", "красный", 2.4, "автомат","седан","G985HJ345",2 , 1);
        Car hyundai = new Car("Hyunday", "Avante", 2016, "Южной Корее", null, 1.6, "механическая", "кроссовер","G872LR855", 7 ,2);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}