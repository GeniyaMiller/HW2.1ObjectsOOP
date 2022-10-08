import Car.Car;
//Владимир, которому 21 год, живет в Казани, сейчас нигде не работает.
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
        Car lada = new Car("Lada", "Grande", "2015", "России", "желтого", "1.7");
        Car audi = new Car(null, "A8", "2020", "Германии", "черный", "3.0");
        Car bmw = new Car("BMW", "Z8", "2021", "Германии", "черный", "3.0");
        Car kia = new Car("Kia", "Sportage 4", "2018", "Южной Корее", "красный", "2.4");
        Car hyundai = new Car("Hyunday", "Avante", "2016", "Южной Корее", null, "1.6");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}