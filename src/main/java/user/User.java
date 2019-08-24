package user;

public class User {

    private String name;
    private int age;
    private Gender gender;
    private Long balance;


    public User() {
    }

    public User(String name, int age, Gender gender, String balance) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.balance = Long.valueOf(
                balance.replace("$", "").
                        replace(".", "").
                        replace(",", ""));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", balance=" + balance +
                '}';
    }
}
