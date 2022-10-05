import Car.Car;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(null, "Минск", 35, "бренд менеджера");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджера");
        Human anya = new Human("Аня", "Москва", -5, "методиста");
        Human artem = new Human("Артем", "Москва", 27, "директора по развитию бизнеса");
        System.out.println(maxim.toString());
        System.out.println(katya.toString());
        System.out.println(anya.toString());
        System.out.println(artem.toString());

        Car lada = new Car("Lada", "Grande", "2015", "России", "желтого", "1.7");
        Car audi = new Car(null, "A8", "2020", "Германии", "черный", "3.0");
        Car bmw = new Car("BMW", "Z8", "2021", "Германии", "черный", "3.0");
        Car kia = new Car("Kia", "Sportage 4", "2018", "Южной Корее", "красный", "2.4");
        Car hyundai = new Car("Hyunday", "Avante", "2016", "Южной Корее", null, "1.6");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }
}