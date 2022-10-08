import java.time.LocalDate;
public class Human {
    private String name;
    private String town;
    private int age;
    private int yearOfBirth;
    private String job;

    public Human (String name, String town, int age, String job) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        setYearOfBirth(age);
        setTown(town);
        if (job != null) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }


    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }
    public String getJob() {
        return job;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public int getAge() {
        return age;
    }
    public void setTown(String town) {
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
    public void setYearOfBirth(int age) {
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - 0;
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " +  town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
