import java.time.LocalDate;
public class Human {
    private String name;
    private String town;
    private int age;
    private String job;


    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }
    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }

    public Human (String name, String town, int age, String job) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }

        if (town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }

        if (job != null) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }
    //высчитываем год рождения
    LocalDate current_date = LocalDate.now();
    int current_Year = current_date.getYear();
    public int calculateYear(int current_Year, int age) {

        int yearOfBirth = current_Year - age;
        return yearOfBirth;
    }


        public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + calculateYear(current_Year, age) + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
