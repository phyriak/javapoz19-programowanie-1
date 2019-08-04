package pl.sdaacademy.javapoz19programowanie1;

public class Author {
    private String firstName;
    private String lastName;
    private int birthyear;
    private Nation nation;

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthyear=" + birthyear +
                ", nation=" + nation +
                '}';
    }

    public Author() {

    }

    public Author(String firstName, String lastName, int birthyear, Nation nation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
        this.nation = nation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
}