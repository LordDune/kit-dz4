package pac.main;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        // Добавление сотрудника в справочник
        catalog.add(new Employee(1, "9555555", "Вася", 5));
        catalog.add(new Employee(2, "9777777", "Оля", 5));
        catalog.add(new Employee(3, "9333333", "Максим", 9));
        catalog.add(new Employee(4, "9222222", "Петр", 6));
        // Поиск сотрудника по стажу
        System.out.println(catalog.findStanding(5)); // [1. Вася: 9555555, стаж: 5, 2. Оля: 9777777, стаж: 5]
        // Вывод телефона по имени сотрудника
        System.out.println(catalog.findPhoneToName("Петр")); // [9222222]
        // Поиск сотрудника по табельному номеру
        System.out.println(catalog.findNumber(1)); // 1. Вася: 9555555, стаж: 5
    }
}