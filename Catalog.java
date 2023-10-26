package pac.main;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Employee> catalog;

    public Catalog(){
        catalog = new ArrayList<>();
    }

    public void add(Employee employee) {
        this.catalog.add(employee);
    }

    public void printEmployees(){
        for (Employee e: catalog) {
            System.out.println(e);
        }
    }

    public ArrayList<Employee> showEmployees(){
        return catalog;
    }

    public ArrayList<Employee> findStanding(Integer standing){
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e: this.showEmployees()) {
            if (e.getStanding() == standing) {
                list.add(e);
            }
        }
        return list;
    }

    public ArrayList<String> findPhoneToName(String name){
        ArrayList<String> list = new ArrayList<>();
        for (Employee e: this.showEmployees()) {
            if (e.getName() == name) {
                list.add(e.getPhone());
            }
        }
        return list;
    }

    public Employee findNumber(Integer number){
        for (Employee e: this.showEmployees()) {
            if (e.getNumber() == number) {
                return e;
            }
        }
        return null;
    }

}
