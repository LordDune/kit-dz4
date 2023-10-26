package pac.main;

public class Employee {

    private Integer number;
    private String phone;
    private String name;
    private Integer standing;

    public Employee(int number, String phone, String name, int standing) {
        this.name = name;
        this.number = number;
        this.phone = phone;
        this.standing = standing;
    }

    public Integer getNumber() {
        return number;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Integer getStanding() {
        return standing;
    }

    @Override
    public String toString(){
        return number + ". " + name + ": " + phone + ", " + "стаж: " + standing;
    }
}
